import java.util.ArrayList;
import java.util.Comparator;

public class Subject {
	private String name;
	private double average = 0;
	ArrayList<Student> std_list;
	// 과목 생성자
	public Subject(String name){
		this.name = name;
	}


	// 학생 추가
	public void addStudent(Student student) {
		std_list.add(student);
	}

	// 학생 삭제
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


	//평균 getter
	public double getAverage() {
		return average;
	}
//보류
/*	//평균 계산
	public void calAverage() {
		int sum = 0;
		int count = 0;
		for (Student i : this.std_list) {
			sum += i.mid_score.get(name);
			count ++;
		}
		this.average = sum/count;
	}*/
	// 등급 계산
	public void calGrade() {
		int total_std = this.std_list.size();
	}
	//성적별 오름차순 정렬
	public void sortScore_Ascending() {
		this.std_list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(true) {
					return 0;
				} else {
					return -1;
				}
			}
		});
	}
/*
	//성적별 내림차순 정렬
	public void sortScore_Decending() {
		this.std_list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getScore(name) > o2.getScore(name)) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}
	
	*/
	
	
}
