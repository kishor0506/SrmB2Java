package jdbc;

import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class GuiTable  extends JFrame
{
	JLabel name,age,id;
	JTextField Tname,Tage,Tid;
	JButton btn_insert,btn_update,btn_delete,btn_view;
	PreparedStatement pt;
	String[] columnNames = {"id", "name", "age"};
	static JTable table;
	JFrame f;
	Connection con;
	String from;
	public GuiTable(){
	    super("TABLE OPERATIONS");
	    id = new JLabel("Id:");
	    name = new JLabel("Name:");
	    age = new JLabel("Age:");
	    id.setBounds(20, 20, 100, 20);
	    name.setBounds(20, 50, 100, 20);
	    age.setBounds(20, 80, 100, 20);
	    
	    Tid = new JTextField(20);
	    Tname = new JTextField(20);
	    Tage = new JTextField(20);
	    Tid.setBounds(130,20,150,20);
	    Tname.setBounds(130, 50, 150, 20);
	    Tage.setBounds(130, 80, 150, 20);
	    btn_insert = new JButton("Insert");
	    btn_update = new JButton("Update");
	    btn_delete = new JButton("Delete");
	    btn_view=new JButton("View");
	    btn_insert.setBounds(20, 120, 80, 30);
	    btn_update.setBounds(180, 120, 80, 30);
	    btn_delete.setBounds(300, 30, 80, 30);
	    btn_view.setBounds(300,90,80,30);
	    
	    
	    setLayout(null);
	    add(id);
	    add(name);
	    add(age);
	    add(Tid);
	    add(Tname);
	    add(Tage);
	    add(btn_insert);
	    add(btn_update);
	    add(btn_delete);
	    add(btn_view);
	    btn_insert.setForeground(Color.blue);
	    btn_update.setForeground(Color.green);
	    btn_delete.setForeground(Color.red);
	    btn_view.setForeground(Color.ORANGE);
	    btn_view.addActionListener(new  ActionListener() {

	         public void actionPerformed(ActionEvent e) {
	         try{
	        	 f = new JFrame("Database");
	             f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	             f.setLayout(new BorderLayout());
	             DefaultTableModel model = new DefaultTableModel();
	             model.setColumnIdentifiers(columnNames);
	             table = new JTable();
	             table.setModel(model);
	             table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	             table.setFillsViewportHeight(true);
	             JScrollPane scroll = new JScrollPane(table);
	             scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	             scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	             int id = 0;
	             String name = "";
	             int age = 0;
	             try {
	            	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "root");
	                 pt = con.prepareStatement("select * from student");
	                 ResultSet rs = pt.executeQuery();
	                 int i = 0;
	                 if (rs.next()) {
	                     id = rs.getInt(id);
	                     name = rs.getString("name");
	                     age = rs.getInt(age);
	                     model.addRow(new Object[]{id,name,age});
	                     i++;
	                 }
	                 if (i < 1) {
	                     JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
	                 }
	                 if (i == 1) {
	                     System.out.println(i + " Record Found");
	                 } else {

	                     System.out.println(i + " Records Found");
	                 }

	             } catch (Exception ex) {

	                 JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

	             }

	             f.add(scroll);

	             f.setVisible(true);

	             f.setSize(400, 300);
	         }
	         catch(Exception ex){}
	         }
	     });
	    
	   btn_insert.addActionListener(new  ActionListener() {
	
	        public void actionPerformed(ActionEvent e) {
	        try{
	        	theQuery("insert into student (id,name,age) values("+Tid.getText()+",'"+Tname.getText()+"',"+Tage.getText()+")");
	        }
	        catch(Exception ex){}
	        }
	    });
	 
       btn_update.addActionListener(new  ActionListener() {

	        public void actionPerformed(ActionEvent e) {
	        try{
	        
	          theQuery("update student set name = '"+Tname.getText()+"', age = "+Tage.getText()+" where id = "+Tid.getText());
	        }
	        catch(Exception ex){}
	        }
       });
	      
	        
       	btn_delete.addActionListener(new  ActionListener() {
	
	        public void actionPerformed(ActionEvent e) {
	        try{
	         
	            theQuery("delete from student where id = "+Tid.getText());
	        }
	        catch(Exception ex){}
	        }
	    });
       	
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    setSize(500,200);
	   
}

	public void theQuery(String query){
	     Connection con = null;
	     Statement st = null;
	     try{
	         con = DriverManager.getConnection("jdbc:mysql://localhost/details","root","root");
	         st = con.createStatement();
	         st.executeUpdate(query);
	         JOptionPane.showMessageDialog(null,"Query Executed successfully");
	     }catch(Exception ex){
	         JOptionPane.showMessageDialog(null,ex.getMessage());
	     }
 }

	 

    public static void main(String[] args){
    
        new  GuiTable();
    }
}
