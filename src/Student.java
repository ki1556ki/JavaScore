import java.util.LinkedList;

public class Student {
	private String name;
	private int std_num;
	
	LinkedList<Subject> sbj_list;
	
	
	
	Subject suject;
	
	
	
	public Student() {
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd_num() {
		return std_num;
	}

	public void setStd_num(int std_num) {
		this.std_num = std_num;
	}
	
	public void addSubject() {
		Subject subject = new Subject();
		sbj_list.add(subject);
	}
	
	public void setScore(String subject, int score) {
		
	}
	
	public int getScore(String subject) {
		return 0;
	}
}
