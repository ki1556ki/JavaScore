package GUI;
public class Lab7Model 
{
	Lab7 c;
	public double w1, w2, w3, w4, w5, e1, e2, e3, e4, la, fa;
	public String fa2;
	public int numStudents = 0;
	student stuData[] = new student[100];
	
	public Lab7Model(Lab7 control)
	{
		c = control;
	}
	
	public void processChange()
	{
		c.tf1.setText("");
		c.tf2.setText("");
		c.tf3.setText("");
		c.tf4.setText("");
		c.tf5.setText("");
	}
	public void processCalculate()
	{
				
		w1 = Double.parseDouble(c.tf1.getText().trim());
		w2 = Double.parseDouble(c.tf2.getText().trim());
		w3 = Double.parseDouble(c.tf3.getText().trim());
		w4 = Double.parseDouble(c.tf4.getText().trim());
		w5 = Double.parseDouble(c.tf5.getText().trim());
		e1 = Double.parseDouble(c.tf7.getText().trim());
		e2 = Double.parseDouble(c.tf8.getText().trim());
		e3 = Double.parseDouble(c.tf9.getText().trim());
		e4 = Double.parseDouble(c.tf10.getText().trim());
		la = Double.parseDouble(c.tf11.getText().trim());
		
		fa = ((w1*e1) + (w2*e2) + (w3*e3) + (w4*e4) + (w5*la))/100;
		Math.round(fa);
		fa2 = String.valueOf(fa);
			
	}
	public void processClear()
	{
		c.tf6.setText("");
		c.tf7.setText("");
		c.tf8.setText("");
		c.tf9.setText("");
		c.tf10.setText("");
		c.tf11.setText("");
		c.tf12.setText("");
		c.clearList();
		c.add.setEnabled(false);
	}
	public void saveStuData(String n, double e1, double e2, double e3, double e4, double la, double fa)
	{
		student currStu = new student();
		currStu.setName(n);
		currStu.setExam1(e1);
		currStu.setExam2(e2);
		currStu.setExam3(e3);
		currStu.setExam4(e4);
		currStu.setLabAverage(la);
		currStu.setFinalAverage(fa);
		
		stuData[numStudents] = currStu;
		numStudents++;
	}
	public void processModify()
	{
		c.tf6.setText(stuData[c.studentList.getSelectedIndex() - 3].getName());
		c.tf7.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getExam1()));
		c.tf8.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getExam2()));
		c.tf9.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getExam3()));
		c.tf10.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getExam4()));
		c.tf11.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getLabAverage()));
		c.tf12.setText(String.valueOf(stuData[c.studentList.getSelectedIndex() - 3].getFinalAverage()));
		
		processDelete();
	}
	public void processDelete()
	{
		for (int i = c.studentList.getSelectedIndex()-3; i < numStudents; i++)
		{
			stuData[i] = stuData[i+1];
		}
		c.model.removeElementAt(c.studentList.getSelectedIndex());
		numStudents--;
	}
	public void processSort(student[] t, int n)
	{
		student currValue;
		int j;
		for (int i=1; i<n;i++)
		{
			currValue = t[i];
			j = i;
			while ((j >= 1) && (currValue.getFinalAverage() < t[j-1].getFinalAverage()))
			{
				t[j] = t[j-1];
				j--;
			}
			t[j] = currValue;
		}
	}

	
}
