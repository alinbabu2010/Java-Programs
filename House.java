import java.awt.*;
import java.applet.*;
/* <applet code="House" width=700 height=700>
</applet>
*/
public class House extends Applet
{
  public void paint(Graphics g)
  {
    g.drawLine(110,210,210,129);
    g.drawLine(310,210,210,129);
    g.drawRect(110,210,200,200);
    g.drawRect(180,320,50,90);
    g.drawOval(142,275,30,30);
    g.drawOval(242,275,30,30); 
  }
}