import java.awt.*;
import java.awt.event.*;
public class ColourWindow extends Frame implements ActionListener
{
  Button red,green,blue,close;
  ColourWindow()
  {
    setLayout(new FlowLayout());
    setSize(400,400);
    setTitle("Buttons in Action");
    setVisible(true); 
    red=new Button("Red");
    green=new Button("Green");
    blue=new Button("Blue");
    close=new Button("Close");
    add(red);
    add(green);
    add(blue);
    add(close);
    red.addActionListener(this);
    green.addActionListener(this);
    blue.addActionListener(this);
    close.addActionListener(this);
    Windowadapter w=new Windowadapter(this);
    addWindowListener(w);
  }
  class Windowadapter extends WindowAdapter
  {
    ColourWindow colourwindow;
    Windowadapter(ColourWindow colourwindow)
    {
      this.colourwindow=colourwindow;
    }
    public void windowClosing(WindowEvent we)
    {
      colourwindow.setVisible(false);
    }
  }
  public void actionPerformed(ActionEvent ae)
  {
     String str=ae.getActionCommand();
     if(str.equals("Red"))
     {  
       setBackground(Color.red);
       close.setForeground(Color.red);
     }
     else if(str.equals("Green"))
     {  
        setBackground(Color.green);
        close.setForeground(Color.green);
     }
     else if(str.equals("Blue"))
     {  
        setBackground(Color.blue);
        close.setForeground(Color.blue);
     }
     else
     {
       setBackground(Color.white);
       close.setForeground(Color.black);
     }
  }
  public static void main(String args[])
  {
    ColourWindow A=new ColourWindow();
  }
}