package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LambdaListenerTest extends JFrame {
	public static void main(String args[]) {
		new LambdaListenerTest();
	}

	private JButton button;

	public LambdaListenerTest() {
		setTitle("Button Event");
		button = new JButton("Click Me!");
		button.addActionListener(ae -> button1Click());
		getContentPane().add(button, BorderLayout.NORTH);
		setSize(450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private int clickCount = 0;

	public void button1Click() {
		clickCount++;
		if (clickCount == 1)
			button.setText("Clicked!!!");
		else
			button.setText("Clicked " + clickCount + " times!!!");
	}
}
