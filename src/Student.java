import java.util.Map;

public class Student {
	private String name; // 이름
	private int std_num; // 학번
	
	private Map<String, Integer> score; // 과목별 점수
	//private Map<String, Integer> grade;
	
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
	// 점수 setter
	public void setScore(String sbj_name, int score) {
		this.score.put(sbj_name, score);
	}
	// 점수 getter
	public int getScore(String sbj_name) {
		return this.score.get(sbj_name);
	}
	
	public Map<String, Integer> getMapScore(){
		return this.score;
	}
}
