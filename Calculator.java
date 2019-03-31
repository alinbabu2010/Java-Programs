import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
/* 
<applet code="Calculator" width=400 height=400>
</applet>
*/
public class Calculator extends Applet implements ActionListener
{
  int n;String a,b;double r;
  Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,add,sub,mul,div,mod,clear,eq;TextField result;
  Button bList[]=new Button[10];
  String s1,s2,s3,s4,s5;
  public void init()
  {
     setLayout(new GridLayout(4,5));
     n0=new Button("0");n1=new Button("1");n2=new Button("2");n3=new Button("3");n4=new Button("4");n5=new Button("5");
     n6=new Button("6");n7=new Button("7");n8=new Button("8");n9=new Button("9");add=new Button("add");
     sub=new Button("sub");mul=new Button("mul");div=new Button("div");mod=new Button("mod");clear=new Button("clear");
     eq=new Button("eq");result=new TextField("");result.setEditable(false);
     add(result);
     bList[0] = (Button)add(n0);bList[1] = (Button)add(n1);
     bList[2] = (Button)add(n2);bList[3] = (Button)add(n3);
     bList[4] = (Button)add(n4);bList[5] = (Button)add(n5);
     bList[6] = (Button)add(n6);bList[7] = (Button)add(n7);
     bList[8] = (Button)add(n8);bList[9] = (Button)add(n9);
     add(add);add(sub);add(mul);add(div);add(mod);add(clear);add(eq);
     for(int i = 0; i < 10; i++) 
     {
         bList[i].addActionListener(this);
     }
     add.addActionListener(this);sub.addActionListener(this);
     mul.addActionListener(this);div.addActionListener(this);
     mod.addActionListener(this);clear.addActionListener(this);
     eq.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
        String str=ae.getActionCommand();
        if(ae.getSource() == bList[0]) 
        {
            s3 = result.getText();
            s4 = "0";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[1]) 
        {
            s3 = result.getText();
            s4 = "1";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[2]) 
        {
            s3 = result.getText();
            s4 = "2";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[3]) 
        {
            s3 = result.getText();
            s4 = "3";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[4]) 
        {
            s3 = result.getText();
            s4 = "4";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[5]) 
        {
            s3 = result.getText();
            s4 = "5";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[6]) 
        {
            s3 = result.getText();
            s4 = "6";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[7]) 
        {
            s3 = result.getText();
            s4 = "7";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[8]) 
        {
            s3 = result.getText();
            s4 = "8";
            s5 = s3+s4;
            result.setText(s5);  
        }
        if(ae.getSource() == bList[9]) 
        {
            s3 = result.getText();
            s4 = "9";
            s5 = s3+s4;
            result.setText(s5);  
        } 
        if(ae.getSource() == add)
        {
          a=result.getText();
          result.setText("");n=1;
          
        }
        if(ae.getSource() == sub)
        {
          a=result.getText();
          result.setText("");n=2;
        }
        if(ae.getSource() == mul)
        {
          a=result.getText();
          n=3;result.setText("");
        }
        if(ae.getSource() == div)
        {
          a=result.getText();
          n=4;result.setText("");
        }
        if(ae.getSource() == mod)
        {
          a=result.getText();
          n=5;result.setText("");
        }
        if(ae.getSource() == eq)
        {
          b=result.getText(); 
          if(n==1)
          {
             r=Integer.parseInt(a)+Integer.parseInt(b);
             result.setText(String.valueOf(r));
          }
          if(n==2)
          {
             r=Integer.parseInt(a)-Integer.parseInt(b);
             result.setText(Double.toString(r));
          }
          if(n==3)
          {
             r=Integer.parseInt(a)*Integer.parseInt(b);
             result.setText(Double.toString(r));
          } 
          if(n==4)
          {
             r=Integer.parseInt(a)/Integer.parseInt(b);
             result.setText(Double.toString(r));
          } 
          if(n==5)
          {
             r=Integer.parseInt(a)%Integer.parseInt(b);
             result.setText(Double.toString(r));
          }
        } 
        if(ae.getSource() == clear)
        {
          result.setText("");
          a="";b="";
        } 
  }
} 
    