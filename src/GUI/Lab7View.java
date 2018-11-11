package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Lab7View extends JApplet
{
	// Declare variables
	
	public JLabel  jl_title, jl_chgweight, jl_name, jl_mid, jl_last, jl_assign, jl_quiz, jl_pres, jl_total,jl_stunum,jl_weight,jl_subj,jl_attend,jl_etc,jl_report,
	jl_current_subj,jl_chgratio,jl_Aplus,jl_Azero,jl_Bplus,jl_Bzero,jl_Cplus,jl_Czero,jl_D,jl_F,jl_ratio;
	public JTextField tf_weight_mid, tf_weight_last, tf_weight_assign, tf_weight_quiz, tf_weight_pres,tf_weight_report,tf_weight_attend, tf_name, tf_mid, tf_last, 
	tf_assign, tf_quiz, tf_pres,tf_report,tf_attend,tf_total,tf_stunum,tf_subj,tf_Aplus,tf_Azero,tf_Bplus,tf_Bzero,tf_Cplus,tf_Czero,tf_D,tf_F;
	public JButton save_weight, change_weight,save_ratio, change_ratio, calculate, add, clear, display, modify, delete, sort, empty,web,oop,aoop,save_stu,modify_stu,delete_stu;
	public JTextArea ta_current_subj;
	public JList studentList;
	public DefaultListModel model;
	public JScrollPane jp1; 
	public JPanel p1, p2, p3, p4, p5, p6, p7, p8,p9;
	public String title = String.format("%-25.20s%8s%8s%8s%8s%15s%15s", "Name", "Exam1","Exam2", "Exam3", "Exam4", "Lab Average", "Final Average");
	public Font f2 = new Font("Monospaced",Font.PLAIN, 12);
	
	public void init()
	{
		setSize(1100,600);
		setLayout(new GridLayout(8,1,0,0));
		constructLabels();
		constructTextFields();
		constructButtons();
		constructList();
		constructLayout();
	}
	public void constructLabels()
	{
		Font f1 = new Font("Serif", Font.BOLD, 40);
		jl_title = new JLabel("명지대 학생 성적 처리 프로그램 ");
			jl_title.setFont(f1);
			jl_title.setForeground(Color.RED);
		jl_chgweight = new JLabel("성적반영비율을 변경하려면 입력하세요.");
		jl_weight = new JLabel("중간       기말       과제       퀴즈       발표       보고서       출결 순입니다.");
		jl_subj = new JLabel("과목");
		jl_name = new JLabel("이름");
		jl_mid = new JLabel("중간고사 성적 ");
		jl_last = new JLabel("기말고사 성적 ");
		jl_assign = new JLabel("과제 점수 ");
		jl_quiz = new JLabel("퀴즈 점수 ");
		jl_pres = new JLabel("발표 점수");
		jl_report = new JLabel("보고서 점수 ");
		jl_attend = new JLabel("출석점수 ");
		jl_etc = new JLabel("기타점수 ");
		jl_total = new JLabel("총점 ");
		jl_stunum = new JLabel("학번");
		jl_current_subj = new JLabel("현재 입력중인 과목 ");
		jl_chgratio = new JLabel("등급비율을 변경하혀면 입력하세요.");
		jl_Aplus = new JLabel("A+");
		jl_Azero = new JLabel("A0");
		jl_Bplus = new JLabel("B+");
		jl_Bzero = new JLabel("B0");
		jl_Cplus = new JLabel("C+");
		jl_Czero = new JLabel("C0");
		jl_D = new JLabel("D");
		jl_F = new JLabel("F");
		jl_ratio = new JLabel("A+       A0        B+       B0       C+       C0       D       F 순입니다.");
		
	}
	public void constructTextFields()
	{
		tf_weight_mid = new JTextField("25", 5); // 중간고사 가중치 
		tf_weight_last = new JTextField("25", 5); // 기말고사 가중치 
		tf_weight_assign = new JTextField("10", 5); // 과제 가중치  
		tf_weight_quiz = new JTextField("10", 5); // 퀴즈 가중치  
		tf_weight_pres = new JTextField("10", 5); // 발표가중치 
		tf_weight_report = new JTextField("10", 5); // 보고서 가중치 
		tf_weight_attend = new JTextField("10", 5); //출결 가중치 
		tf_name = new JTextField("", 5); // 이름입력
		tf_stunum = new JTextField("", 7); // 학번입력 
		tf_subj = new JTextField("", 5); // 과목입력 
		tf_mid = new JTextField("", 10); // 
		tf_last = new JTextField("", 10);
		tf_assign = new JTextField("", 10);
		tf_quiz = new JTextField("", 10);
		tf_pres = new JTextField("", 10);
		tf_report = new JTextField("",10);
		tf_attend = new JTextField("",10);
		tf_total = new JTextField("", 10);
		tf_total.setEnabled(false);
		tf_Aplus = new JTextField("15",5);
		tf_Azero = new JTextField("15",5);
		tf_Bplus = new JTextField("15",5);
		tf_Bzero = new JTextField("15",5);
		tf_Cplus = new JTextField("10",5);	
		tf_Czero = new JTextField("10",5);
		tf_D = new JTextField("10",5);
		tf_F = new JTextField("10",5);
		ta_current_subj = new JTextArea(1,6);
	}
	public void constructButtons()
	{
		save_weight = new JButton("Save Weights");
		change_weight = new JButton("Change Weights");
		save_ratio = new JButton("등급비율저장");
		change_ratio = new JButton("등급비율변경");
		save_stu = new JButton("학생저장");
		delete_stu = new JButton("학생삭제");
		modify_stu = new JButton("학생수정");
		calculate = new JButton("Calculate Average");
		add = new JButton("Add to Database");
			add.setEnabled(false);
		clear = new JButton("Clear Form");
		display = new JButton("Display Students");
			display.setEnabled(false);
		modify = new JButton("Modify Student");
		delete = new JButton("Delete Student");
			delete.setEnabled(false);
		sort = new JButton("Sort Ascending by Average");
			sort.setEnabled(false);
		empty = new JButton("Empty Database");	
			empty.setEnabled(false);
		web = new JButton("웹프로그래밍 ");
			web.setEnabled(true);
		oop = new JButton("객체지향 프로그래밍 ");
			oop.setEnabled(true);
		aoop = new JButton("고급객체지향 프로그래밍 ");
		aoop.setEnabled(true);
	}
	public void constructList()
	{
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		model = new DefaultListModel();
		studentList = new JList(model);
		jp1 = new JScrollPane(studentList);
		studentList.setVisibleRowCount(30);
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
		p1 = new JPanel(new FlowLayout()); // 제목 
			add(p1);
			p1.add(jl_title);
			
		p2 = new JPanel(new FlowLayout()); // 과목 선택  
			add(p2);
			p2.add(web);
			p2.add(oop);
			p2.add(aoop);
			p2.add(jl_current_subj);
			p2.add(ta_current_subj);
			
		p3 = new JPanel(new FlowLayout()); // 등급 비울 입력 
			add(p3);
			p3.add(jl_chgratio);
			p3.add(tf_Aplus);
			p3.add(tf_Azero);
			p3.add(tf_Bplus);
			p3.add(tf_Bzero);
			p3.add(tf_Cplus);
			p3.add(tf_Czero);
			p3.add(tf_D);
			p3.add(tf_F);
			p3.add(save_ratio);
			p3.add(change_ratio);
			p3.add(jl_ratio);

			
		p4 = new JPanel(new FlowLayout());  // 성적 반영 비율입력
			add(p4);
			p4.add(jl_weight);
			p4.add(jl_chgweight);
			p4.add(tf_weight_mid);
			p4.add(tf_weight_last);
			p4.add(tf_weight_assign);
			p4.add(tf_weight_quiz);
			p4.add(tf_weight_pres);
			p4.add(tf_weight_report);
			p4.add(tf_weight_attend);
			p4.add(save_weight);
			p4.add(change_weight);
			p4.add(jl_weight);

			
			
		p5 = new JPanel(new FlowLayout()); // 이름 학번 입력
			add(p5);
			p5.add(jl_name);
			p5.add(tf_name);
			p5.add(jl_stunum);
			p5.add(tf_stunum);
			p5.add(save_stu);
			p5.add(delete_stu);
			p5.add(modify_stu);
			
		p6 = new JPanel(new GridLayout(2,6,50,0)); // 성적입력 
			add(p6);
			p6.add(jl_mid);
			p6.add(jl_last);
			p6.add(jl_assign);
			p6.add(jl_quiz);
			p6.add(jl_pres);
			p6.add(jl_report);
			p6.add(jl_attend);
			p6.add(jl_total);
			
			
			p6.add(tf_mid);
			p6.add(tf_last);
			p6.add(tf_assign);
			p6.add(tf_quiz);
			p6.add(tf_pres);
			p6.add(tf_report);
			p6.add(tf_attend);
			p6.add(tf_total);
		p7 = new JPanel(new FlowLayout()); // 버튼 입력 
			add(p7);
			p7.add(calculate);
			p7.add(add);
			p7.add(clear);
		p8 = new JPanel(new GridLayout(5,1)); // 
			p8.add(display);
			p8.add(modify);
			p8.add(delete);
			p8.add(sort);
			p8.add(empty);
		p9 = new JPanel(new GridLayout(1,2,20,0));
			p9.add(jp1);
			p9.add(p8);
			add(p9);			
	}
}