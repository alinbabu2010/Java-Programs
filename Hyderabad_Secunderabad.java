import java.awt.*;
import java.awt.event.*;
public class Hyderabad_Secunderabad extends Frame implements ActionListener
{
List tl, gl, ml, al;
Button fb, lb, nb, tb, gb, mb, sb,pb; 
CardLayout cl;
Panel sp, bp, ep;
public Hyderabad_Secunderabad()
{
setTitle("Welcome to Hyderabad, India"); // title to the Frame
tl = new List(4);
gl = new List(4);
ml = new List(4);
al = new List(4);

tl.add("Sudersan complex");
tl.add("Sandhya complex");
tl.add("Odeon complex");
tl.add("Ramakrishana Estate");
tl.add("IMAX 70MM");
tl.add("Surya 35MM");
tl.add("Shanthi 70MM");

gl.add("Indira Park");
gl.add("Lumbibi Park");
gl.add("Sanjivayya Park");
gl.add("Zoo Park");
gl.add("Public Gardens");

ml.add("Chiran Palace");
ml.add("Falaknuma Palace");
ml.add("Charminar");
ml.add("QQ Tombs");
ml.add("Golconda Fort");
ml.add("Zuma Majid");

al.add("Birla Mandir");
al.add("Planetorium");
al.add("Hi-Tech city");
al.add("Buddha Purnima");
al.add("Ramoji Filmcity");
al.add("Shilparamam");

cl = new CardLayout();
sp = new Panel();
sp.setLayout(cl);
sp.add(tl,"t");
sp.add(gl,"g");
sp.add(ml,"m") ;
sp.add(al,"a") ;
fb = new Button("First Button");
lb = new Button("Last Button");
nb = new Button("Next Button");
pb = new Button("Previous Button");
bp = new Panel() ;
bp.setLayout(new GridLayout(1, 4)) ;
bp.add(fb);
bp.add(nb);
bp.add(pb);
tb = new Button("Theatres");
gb = new Button ("Gardens");
mb = new Button("Monuments");
sb = new Button("Special");

ep = new Panel(); 
ep.setLayout(new GridLayout(1, 4, 5, 0)); 
// grid layout   with gaps

ep.add(tb);
ep.add(gb);
ep.add(mb);
ep.add(sb);

fb.addActionListener(this);
nb.addActionListener(this);
pb.addActionListener(this);
lb.addActionListener(this);
tb.addActionListener(this);
gb.addActionListener(this);
mb.addActionListener(this);
sb.addActionListener(this);
add(bp, "South");
add(sp, "Center") ;
add(ep, "North") ;

setSize(300, 300);
setVisible(true) ;
}
public void actionPerformed(ActionEvent e)
{
String str = e.getActionCommand() ;
if(str.equals("First Button"))
cl.first(sp) ;
else if(str.equals("Next Button"))
cl.next(sp);
else if(str.equals("Previous Button"))
cl.previous(sp);
else if(str.equals("Last Button"))
cl.last(sp);
else if(str.equals("Theatres"))
cl.show(sp, "t");
else if(str.equals("Gardens"))
cl.show(sp, "g");
else if(str.equals("Monuments"))
cl.show(sp, "m");
else if(str.equals("Special"))
cl.show(sp, "a");
}
public static void main(String args[])
{
new Hyderabad_Secunderabad();
}
}