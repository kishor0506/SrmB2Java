
import java.awt.*;
import java.awt.Color;
class SimpleFrame extends Frame
{
  SimpleFrame(String t)
  {
     super(t);
     Label l1=new Label("Good Morning");
     l1.setForeground(Color.WHITE);
     add(l1);
   }
  public static void main(String[] a)
  {
     SimpleFrame sf=new SimpleFrame("My Simple Frame");
     sf.setSize(400,400);
     sf.setBackground(Color.BLUE);
     sf.setVisible(true);
   }
 }