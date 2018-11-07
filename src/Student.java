import java.util.Map;

public class Student extends Score {
	private String name; // 이름
	private int std_num; // 학번
	public Map<String, Character> grade;
	
	// 학생 생성자
	public Student(String name, String num) {
		this.name = name;
		this.std_num = Integer.parseInt(num);
	}

	// 이름 getter
	public String getName() {
		return name;
	}
	// 이름 setter
	public void setName(String name) {
		this.name = name;
	}

	// 학번 getter
	public int getStd_num() {
		return std_num;
	}
	
	// 학번 setter
	public void setStd_num(int std_num) {
		this.std_num = std_num;
	}

}
