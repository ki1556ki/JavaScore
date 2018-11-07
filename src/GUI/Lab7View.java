package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Lab7View extends JApplet
{
	// Declare variables
	
	public JLabel  jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9;
	public JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12;
	public JButton save, change, calculate, add, clear, display, modify, delete, sort, empty;
	public JList studentList;
	public DefaultListModel model;
	public JScrollPane jp1; 
	public JPanel p1, p2, p3, p4, p5, p6, p7;
	public String title = String.format("%-25.20s%8s%8s%8s%8s%15s%15s", "Name", "Exam1","Exam2", "Exam3", "Exam4", "Lab Average", "Final Average");
	public Font f2 = new Font("Monospaced",Font.PLAIN, 12);
	
	public void init()
	{
		setSize(950,500);
		setLayout(new GridLayout(6,1,0,0));
		constructLabels();
		constructTextFields();
		constructButtons();
		constructList();
		constructLayout();
	}
	public void constructLabels()
	{
		Font f1 = new Font("Serif", Font.BOLD, 40);
		jl1 = new JLabel("Student Grade Database");
			jl1.setFont(f1);
			jl1.setForeground(Color.RED);
		jl2 = new JLabel("Enter Weight as '%':");
		jl3 = new JLabel("Enter Student Name ===>");
		jl4 = new JLabel("Exam 1");
		jl5 = new JLabel("Exam 2");
		jl6 = new JLabel("Exam 3");
		jl7 = new JLabel("Exam 4");
		jl8 = new JLabel("Lab Average");
		jl9 = new JLabel("Final Average");	
	}
	public void constructTextFields()
	{
		tf1 = new JTextField("", 5);
		tf2 = new JTextField("", 5);
		tf3 = new JTextField("", 5);
		tf4 = new JTextField("", 5);
		tf5 = new JTextField("", 5);
		tf6 = new JTextField("", 20);
		tf7 = new JTextField("", 10);
		tf8 = new JTextField("", 10);
		tf9 = new JTextField("", 10);
		tf10 = new JTextField("", 10);
		tf11 = new JTextField("", 10);
		tf12 = new JTextField("", 10);
			tf12.setEnabled(false);
	}
	public void constructButtons()
	{
		save = new JButton("Save Weights");
		change = new JButton("Change Weights");
		calculate = new JButton("Calculate Average");
		add = new JButton("Add to Database");
			add.setEnabled(false);
		clear = new JButton("Clear Form");
		display = new JButton("Display Students");
			display.setEnabled(false);
		modify = new JButton("Modify Student");
			modify.setEnabled(false);
		delete = new JButton("Delete Student");
			delete.setEnabled(false);
		sort = new JButton("Sort Ascending by Average");
			sort.setEnabled(false);
		empty = new JButton("Empty Database");	
			empty.setEnabled(false);
	}
	public void constructList()
	{
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		model = new DefaultListModel();
		studentList = new JList(model);
		jp1 = new JScrollPane(studentList);
		studentList.setVisibleRowCount(15);
			studentList.setFont(f2);
			studentList.setBorder(lineBorder);
		model.addElement(title);
		model.addElement("--------------------------------------------------"
						+ "--------------------------------------------------"
						+ "------------------------------------------");
		model.addElement("");
	}
	public void constructLayout()
	{
		p1 = new JPanel(new FlowLayout());
			add(p1);
			p1.add(jl1);
		p2 = new JPanel(new FlowLayout());
			add(p2);
			p2.add(jl2);
			p2.add(tf1);
			p2.add(tf2);
			p2.add(tf3);
			p2.add(tf4);
			p2.add(tf5);
			p2.add(save);
			p2.add(change);
		p3 = new JPanel(new FlowLayout());
			add(p3);
			p3.add(jl3);
			p3.add(tf6);
		p4 = new JPanel(new GridLayout(2,6,50,0));
			add(p4);
			p4.add(jl4);
			p4.add(jl5);
			p4.add(jl6);
			p4.add(jl7);
			p4.add(jl8);
			p4.add(jl9);
			p4.add(tf7);
			p4.add(tf8);
			p4.add(tf9);
			p4.add(tf10);
			p4.add(tf11);
			p4.add(tf12);
		p5 = new JPanel(new FlowLayout());
			add(p5);
			p5.add(calculate);
			p5.add(add);
			p5.add(clear);
		p7 = new JPanel(new GridLayout(5,1));
			p7.add(display);
			p7.add(modify);
			p7.add(delete);
			p7.add(sort);
			p7.add(empty);
		p6 = new JPanel(new GridLayout(1,2,20,0));
			p6.add(jp1);
			p6.add(p7);
			add(p6);			
	}
}