
public class Subject implements Attend {
	private String name;
	private int attend;
	private char grade;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int setAttend(int num) {
		// TODO Auto-generated method stub
		this.attend = num;
		return 0;
	}

	@Override
	public int getAttend() {
		// TODO Auto-generated method stub
		return this.attend;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}
