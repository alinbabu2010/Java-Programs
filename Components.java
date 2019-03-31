import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* 
<applet code="Components" width=655 height=700>
</applet>
*/
public class Components extends Applet implements ActionListener,ItemListener 
{
   String msg1,msg2,msg3,msg4,msg5;
   TextField fname,lname;
   Button enter,cancel;
   Checkbox male,female;
   CheckboxGroup cbg;
   Choice qualify,occup;
   TextArea address;
   public void init()
   {
      cbg = new CheckboxGroup();
      setLayout(new FlowLayout(FlowLayout.LEFT,50,30));
      fname=new TextField(10);
      lname=new TextField(10);
      enter=new Button("Enter");
      cancel=new Button("Cancel");
      address=new TextArea(5,15);
      Label fname1=new Label("First Name:",Label.RIGHT);
      Label lname1=new Label("Last Name:",Label.LEFT);
      Label gender=new Label("Gender:",Label.RIGHT);
      Label addr=new Label("Address:");
      Label qual=new Label("Qualifiction:",Label.RIGHT);
      Label occu=new Label("Occupation:",Label.RIGHT);
      male=new Checkbox("MALE",cbg,false);
      female=new Checkbox("FEMALE",cbg,false);
      qualify=new Choice();
      occup=new Choice();
      qualify.add("Under Graduate"); qualify.add("Post Graduate");
      occup.add("Engineer(Student)");occup.add("Doctor");occup.add("Mechanic");
      add(fname1);add(fname);add(lname1);add(lname);
      add(addr);add(address);add(gender);add(male);
      add(female);add(qual);add(qualify);add(occu);
      add(occup);add(enter);add(cancel);
      fname.addActionListener(this);lname.addActionListener(this);
      male.addItemListener(this);female.addItemListener(this);qualify.addItemListener(this);
      occup.addItemListener(this);enter.addActionListener(this);cancel.addActionListener(this);  
   }
   public void itemStateChanged(ItemEvent ie)
   {
     repaint();
   }
   public void actionPerformed(ActionEvent ae)
   {
     if(ae.getSource()==enter)
     {
          repaint();
          msg1="First Name:"+fname.getText();
          msg2="Last Name:"+lname.getText();
          msg3="Address:"+address.getText();
          msg4="Gender:"+cbg.getSelectedCheckbox().getLabel();
          msg5="Qualification:"+occup.getSelectedItem();        
     }
     if(ae.getSource()==cancel)
     {
          repaint();
          msg1="";msg2="";msg3="";msg4="";msg5="";     
     }
      
   }
   public void paint(Graphics g)
   {
        g.drawString(msg1,50,350);
        g.drawString(msg2,50,370);
        g.drawString(msg3,50,390);
        g.drawString(msg4,50,410);
        g.drawString(msg5,50,450); 
   }
}      