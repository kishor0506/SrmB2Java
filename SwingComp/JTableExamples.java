package SwingComp;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExamples {

	JFrame f;

	JTable j;

	JTableExamples() {

		f = new JFrame();

		f.setTitle("Student");

		String[][] data = { { "srinath", "4031", "Mca" }, { "Lokesh", "6014", "Msc" } };

		String[] columnNames = { "Name", "Roll Number", "Department" };

		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		JScrollPane sp = new JScrollPane(j);
		f.add(sp);

		f.setSize(500, 200);

		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JTableExamples();
	}
}