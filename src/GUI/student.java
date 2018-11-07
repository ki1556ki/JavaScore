package GUI;
public class student 
{
	private String name;
	private double exam1;
	private double exam2;
	private double exam3;
	private double exam4;
	private double labAverage;
	private double finalAverage;
	
	public student()
	{
		
	}
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}
	public void setExam1(double e1)
	{
		exam1 = e1;
	}
	public double getExam1()
	{
		return exam1;
	}
	public void setExam2(double e2)
	{
		exam2 = e2;
	}
	public double getExam2()
	{
		return exam2;
	}
	public void setExam3(double e3)
	{
		exam3 = e3;
	}
	public double getExam3()
	{
		return exam3;
	}
	public void setExam4(double e4)
	{
		exam4 = e4;
	}
	public double getExam4()
	{
		return exam4;
	}
	public void setLabAverage(double la)
	{
		labAverage = la;
	}
	public double getLabAverage()
	{
		return labAverage;
	}
	public void setFinalAverage(double fa)
	{
		finalAverage = fa;
	}
	public double getFinalAverage()
	{
		return finalAverage;
	}
	
}
