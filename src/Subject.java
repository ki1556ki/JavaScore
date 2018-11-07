import java.util.ArrayList;

public class Subject {
	private String name;
	private char grade;
	private double average;

	ArrayList<Student> std_list;

	public Subject(String name){
		this.name = name;
	}


	//과목 수강
	public void addStudent(Student student) {
		std_list.add(student);
	}

	//과목 철회
	public void delStudent(Student student) {
		if(std_list.contains(student)) {
			std_list.remove(student);
		} else {
			//해당 학생 없음
		}
	}

	//과목이름 getter
	public String getName() {
		return name;
	}
	//과목이름 setter
	public void setName(String name) {
		this.name = name;
	}

	//성정 getter
	public char getGrade() {
		return grade;
	}

	//성적 setter
	public void setGrade(char grade) {
		this.grade = grade;
	}

	//평균 getter
	public double getAverage() {
		return average;
	}

	//평균 계산
	public void calAverage() {
		int sum = 0;
		int count = 0;
		for (Student i : this.std_list) {
			sum += i.getMapScore().get(name);
			count ++;
		}
		this.average = sum/count;
	}
}
