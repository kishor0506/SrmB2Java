package SwingComp;

import javax.swing.*;
import java.awt.*;
public class tabbed {
   public static void main(String args[]) {
      JFrame frame = new JFrame("Skoda");
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel panel1, panel2, panel3, panel4, panel5;
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();
      panel5 = new JPanel();
      tabbedPane.addTab("Octavia", panel1);
      tabbedPane.addTab("rapid ", panel2);
      tabbedPane.addTab("fabia", panel3);
      tabbedPane.addTab("superb ", panel4);
      tabbedPane.addTab("kushaq", panel5);
      frame.add(tabbedPane);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(550,350);
      frame.setVisible(true);
   }
}