import java.awt.*;
import java.awt.event.*;
public class Framecalculator extends Frame implements ActionListener
{
  TextField first,second,result;
  Button add,sub,mul,div,mod,clear;
  Framecalculator()
  {
     setVisible(true);
     setLayout(new GridLayout(6,2));
     setTitle("Calculator");
     setSize(400,400);
     Label firstlabel=new Label("FIRST NO:",Label.LEFT);
     Label secondlabel=new Label("SECOND NO:",Label.LEFT);
     Label thirdlabel=new Label("RESULT",Label.LEFT);
     first=new TextField();
     second=new TextField();
     result=new TextField("");result.setEditable(false);
     add(firstlabel);add(first);add(secondlabel);add(second);add(thirdlabel);add(result);
     add=new Button("ADD");sub=new Button("SUB");mul=new Button("MUL");div=new Button("DIV");
     mod=new Button("MOD");clear=new Button("CLEAR");
     add(add);add(sub);add(mul);add(div);add(mod);add(clear);
     first.addActionListener(this);
     second.addActionListener(this);
     result.addActionListener(this);
     add.addActionListener(this);
     sub.addActionListener(this);
     mul.addActionListener(this);
     div.addActionListener(this);
     mod.addActionListener(this);
     clear.addActionListener(this);
     mywindowadapter w=new mywindowadapter(this);addWindowListener(w);
  }
  public class mywindowadapter extends WindowAdapter
  {
      
     Framecalculator framecalculator;
     mywindowadapter (Framecalculator framecalculator)
     {
       this.framecalculator=framecalculator;
     }
     public void windowClosing(WindowEvent we)
     {
        framecalculator.setVisible(false);
     }
  }
  public void actionPerformed(ActionEvent ae)
  {
     String str=ae.getActionCommand();
     int a,b;double r;
     if(str.equals("ADD"))
     {
        a=Integer.parseInt(first.getText());b=Integer.parseInt(second.getText());
        r=a+b;result.setText(Double.toString(r));
     }
     else if(str.equals("SUB"))
     {
        a=Integer.parseInt(first.getText());b=Integer.parseInt(second.getText());
        r=a-b;result.setText(Double.toString(r));
     }
     else if(str.equals("MUL"))
     {
        a=Integer.parseInt(first.getText());b=Integer.parseInt(second.getText());
        r=a*b;result.setText(Double.toString(r));
     }
     else if(str.equals("DIV"))
     {
        a=Integer.parseInt(first.getText());b=Integer.parseInt(second.getText());
        r=a/b;result.setText(Double.toString(r));
     }
     else if(str.equals("MOD"))
     {
        a=Integer.parseInt(first.getText());b=Integer.parseInt(second.getText());
        r=a%b;result.setText(Double.toString(r));
     }
     else
     {
        first.setText("");second.setText("");result.setText("");
     }
  }
  public static void main(String args[])
  {
    Framecalculator A=new Framecalculator();
  }
}
  