import javax.swing.JOptionPane;

public class Area {
  public static void main(String[] args) { 
   double radius, area;

  int dialogType = JOptionPane.PLAIN_MESSAGE;
    String input = JOptionPane.showInputDialog(null, 
         "Enter radius ", "Circle Area Input", 
         dialogType);
   radius = Double.parseDouble(input);
   area = Math.PI * Math.pow(radius, 2);
    String message = "Area of Circle: " + area;
   String title = "Circle Area Output";
   JOptionPane.showMessageDialog(null, message, 
          title, dialogType);
  }
}

