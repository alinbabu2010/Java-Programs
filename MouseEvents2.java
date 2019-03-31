import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=MouseEvents2 width=300 height=100>
</applet>
*/
public class MouseEvents2 extends Applet implements MouseListener 
{
  String msg = "";
  int mouseX = 0, mouseY = 0; // coordinates of mouse
  public void init() 
  {
     addMouseListener(this);
  }
  // Handle mouse clicked.
  public void mouseClicked(MouseEvent me) 
  {
  // save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "Mouse clicked"+ mouseX + ", " + mouseY;
    showStatus("MOUSE CLICKED AT" + mouseX + ", " + mouseY);
    repaint();
  }
  // Handle mouse entered.
  public void mouseEntered(MouseEvent me)
  {

  }
// Handle mouse exited.
public void mouseExited(MouseEvent me) {

}
// Handle button released.
public void mouseReleased(MouseEvent me) {

}

public void mousePressed(MouseEvent me) {
}
public void paint(Graphics g) {
g.drawString(msg, mouseX, mouseY);

}
}