import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code=Mouseclick width=650 height=500>
</applet>
*/
public class Mouseclick extends Applet
{
  String msg="";
  int mousex=0,mousey=0;
  public void init()
  {
     Mymouseadapter a1=new Mymouseadapter(this);
     addMouseListener(a1);
  }
  public void paint(Graphics g) 
  { 
     g.drawString(msg,mousex,mousey);
     g.drawLine(110,210,210,129);
     g.drawLine(310,210,210,129);
     g.drawRect(110,210,200,200);
     g.drawRect(180,320,50,90);
     g.drawOval(142,275,30,30);
     g.drawOval(242,275,30,30);
  }
  class Mymouseadapter extends MouseAdapter
  {
    Mouseclick mouseclick;
    Mymouseadapter(Mouseclick mouseclick)
    {
      this.mouseclick=mouseclick;
    }
    public void mouseClicked(MouseEvent me)
    {
        mousex=me.getX();
        mousey=me.getY();
        msg="Mouse clicked at "+mousex+","+mousey;
        showStatus("Mouse clicked at "+mousex+","+mousey);
        repaint();
    }
  }
}

