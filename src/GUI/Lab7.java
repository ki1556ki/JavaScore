package GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.event.*;

public class Lab7 extends Lab7View implements ActionListener, ListSelectionListener
{
	Lab7Model m = new Lab7Model(this);
	String n;
	public void init()
	{
		super.init();
		
		save.addActionListener(this);
		change.addActionListener(this);
		calculate.addActionListener(this);
		add.addActionListener(this);
		clear.addActionListener(this);
		display.addActionListener(this);
		modify.addActionListener(this);
		delete.addActionListener(this);
		sort.addActionListener(this);
		empty.addActionListener(this);
		studentList.addListSelectionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == save)
		{
			tf1.setEnabled(false);
			tf2.setEnabled(false);
			tf3.setEnabled(false);
			tf4.setEnabled(false);
			tf5.setEnabled(false);
		}
		else if (e.getSource() == change)
		{
			tf1.setEnabled(true);
			tf2.setEnabled(true);
			tf3.setEnabled(true);
			tf4.setEnabled(true);
			tf5.setEnabled(true);
			m.processChange();
		}
		else if (e.getSource() == calculate)
		{
			try
			{
			m.processCalculate();
			}
			catch (NumberFormatException q)
			{
				tf12.setText("Invalid Input");
			}
			if (m.w1 + m.w2 + m.w3 + m.w4 + m.w5 != 100)
			{
				tf12.setText("ERROR: Weights");
			}
			else
			{
				tf12.setText(m.fa2);
			}
			if (m.e1 > 100 || m.e2 > 100 || m.e3 > 100 || m.e4 > 100 || m.la > 100)
			{
				tf12.setText("ERROR: > 100");
			}
			else if (m.e1 < 0 || m.e2 < 0 || m.e3 < 0 || m.e4 < 0 || m.la < 0)
			{
				tf12.setText("ERROR: < 0");
			}
			try
			{
			m.processCalculate();
			}
			catch (NumberFormatException q)
			{
				tf12.setText("Invalid Input");
			}
			add.setEnabled(true);
		}
		else if (e.getSource() == clear)
		{
			m.processClear();
		}
		else if (e.getSource() == add)
		{
			processAdd();
			display.setEnabled(true);
			sort.setEnabled(true);
			empty.setEnabled(true);
		}
		else if (e.getSource() == display)
		{
			processDisplay();
		}
		else if (e.getSource() == modify)
		{
			m.processModify();
		}
		else if (e.getSource() == delete)
		{
			m.processDelete();
		}
		else if (e.getSource() == sort)
		{
			m.processSort(m.stuData, m.numStudents);
			clearList();
			processDisplay();
			sort.setEnabled(false);
		}
		else if (e.getSource() == empty)
		{
			clearList();	
			m.numStudents = 0;
			Arrays.fill(m.stuData, null);
			m.e1 = Double.NaN;
			m.e2 = Double.NaN;
			m.e3 = Double.NaN;
			m.e4 = Double.NaN;
			m.la = Double.NaN;
			m.fa = Double.NaN;
			
			display.setEnabled(false);
			empty.setEnabled(false);
		}
	}
	public void clearList()
	{
		model.removeAllElements();
		model.addElement(title);
		model.addElement("--------------------------------------------------"
				+ "--------------------------------------------------"
				+ "------------------------------------------");
		model.addElement("");
	}
	private void processAdd()
	{
			n = tf6.getText().trim();
			m.saveStuData(n, m.e1, m.e2, m.e3, m.e4, m.la, m.fa);
			add.setEnabled(false);
			m.processClear();
	}
	private void processDisplay()
	{
		clearList();
		for (int i = 0; i < m.numStudents; i++)
		{
			String n = m.stuData[i].getName();
			double v = m.stuData[i].getExam1();
			double u = m.stuData[i].getExam2();
			double w = m.stuData[i].getExam3();
			double x = m.stuData[i].getExam4();
			double y = m.stuData[i].getLabAverage();
			double z = m.stuData[i].getFinalAverage();
			
			model.addElement(String.format("%-25.23s%8.2f%8.2f%8.2f%8.2f%15.2f%15.2f", n, v, u, w, x, y, z));
		}
		studentList.setFont(f2);
	}
	public void valueChanged(ListSelectionEvent l)
	{
		if (l.getSource() == studentList)
		{
			if (studentList.getSelectedIndex() <= 2)
			{
				modify.setEnabled(false);
				delete.setEnabled(false);	
			}
			else
			{
				modify.setEnabled(true);
				delete.setEnabled(true);
			}
		}
	}
}
