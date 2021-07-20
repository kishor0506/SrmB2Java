package lambdaexp;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class EventUsingLambdaExp extends JFrame
{
	private JButton button1;
	 public EventUsingLambdaExp()
	 {
		  this.setSize(300,150);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setTitle("Event Listener");
		  JPanel panel1 = new JPanel();
		  button1 = new JButton("Click Me!");
		  button1.setBackground(Color.GREEN);
		  button1.setForeground(Color.WHITE);
		  button1.setFont(new Font("Castellar",Font.BOLD,30));
		  button1.addActionListener(e -> button1Click() );
		  panel1.add(button1);
		  this.add(panel1);
		  this.setVisible(true);
	 }
	 private int Count = 0;
	 public void button1Click()
	 {
		  Count++;
		  if (Count == 1)
		  {
			  button1.setText("I’ve been clicked!");
		  }
		  else
		   {button1.setText("I’ve been clicked "+ Count + " times!");}
	 }
	
	public static void main(String[] args) {
		new EventUsingLambdaExp();
	}

}
