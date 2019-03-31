// Demonstrate an adapter.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AdapterDemo" width=300 height=100>
</applet>
*/
public class AdapterDemo extends Applet 
{
   public void init() 
   {
      MyMouseAdapter a1 = new MyMouseAdapter(this);
      addMouseListener(a1);
      MyMouseMotionAdapter a2 = new MyMouseMotionAdapter(this);
      addMouseMotionListener(a2);
   }
}
class MyMouseAdapter extends MouseAdapter 
{
   AdapterDemo adapterDemo;
   MyMouseAdapter(AdapterDemo adapterDemo)  //  constructor
   {
     this.adapterDemo = adapterDemo;
   }
   public void mouseClicked(MouseEvent me)
   {
    adapterDemo.showStatus("Mouse clicked");
   }
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
   AdapterDemo adapterDemo;
   public MyMouseMotionAdapter(AdapterDemo adapterDemo)
   {
      this.adapterDemo = adapterDemo;
   }
   public void mouseDragged(MouseEvent me)
   {
     adapterDemo.showStatus("Mouse dragged");
   }
}

