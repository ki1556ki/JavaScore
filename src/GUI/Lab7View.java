package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Lab7View extends JApplet
{
	// Declare variables
	
	public JLabel  jl_title, jl_chgweight, jl_name, jl_mid, jl_last, jl_assign, jl_quiz, jl_pres, jl_total,jl_stunum,jl_weight,jl_subj,jl_attend,jl_etc,jl_report,jl_current_subj;
	public JTextField tf_weight_mid, tf_weight_last, tf_weight_assign, tf_weight_quiz, tf_weight_pres, tf_name, tf7, tf8, tf9, tf10, tf11, tf12,tf_stunum,tf_subj;
	public JButton save, change, calculate, add, clear, display, modify, delete, sort, empty,web,oop,aoop;
	public JTextArea ta_current_subj;
	public JList studentList;
	public DefaultListModel model;
	public JScrollPane jp1; 
	public JPanel p1, p2, p3, p4, p5, p6, p7,p8;
	public String title = String.format("%-25.20s%8s%8s%8s%8s%15s%15s", "Name", "Exam1","Exam2", "Exam3", "Exam4", "Lab Average", "Final Average");
	public Font f2 = new Font("Monospaced",Font.PLAIN, 12);
	
	public void init()
	{
		setSize(1000,600);
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
		jl_chgweight = new JLabel("성적의 비율을 변경하려면 입력하세요.");
		jl_weight = new JLabel("Default : 중간 25% 기말 25% 과제 10% 퀴즈 10% 발표 10% 보고서 10% 출결 10%");
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
		
	}
	public void constructTextFields()
	{
		tf_weight_mid = new JTextField("", 5); // 중간고사 가중치 
		tf_weight_last = new JTextField("", 5); // 기말고사 가중치 
		tf_weight_assign = new JTextField("", 5); // 과제 가중치  
		tf_weight_quiz = new JTextField("", 5); // 퀴즈 가중치  
		tf_weight_pres = new JTextField("", 5); // 발표가중치 
		tf_name = new JTextField("", 5); // 이름입력
		tf_stunum = new JTextField("", 7); // 학번입력 
		tf_subj = new JTextField("", 5); // 과목입력 
		tf7 = new JTextField("", 10); // 
		tf8 = new JTextField("", 10);
		tf9 = new JTextField("", 10);
		tf10 = new JTextField("", 10);
		tf11 = new JTextField("", 10);
		tf12 = new JTextField("", 10);
			tf12.setEnabled(false);
		ta_current_subj = new JTextArea(1,6);
	}
	public void constructButtons()
	{
		save = new JButton("Save Weights");
		change = new JButton("Change Weights");
		calculate = new JButton("Calculate Average");
		add = new JButton("Add to Database");
			add.setEnabled(false);
		clear = new JButton("Clear Form");
		display = new JButton("Display Students");
			display.setEnabled(false);
		modify = new JButton("Modify Student");
			modify.setEnabled(false);
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
		studentList.setVisibleRowCount(15);
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
		p2 = new JPanel(new FlowLayout()); // 과목 선
			add(p2);
			p2.add(web);
			p2.add(oop);
			p2.add(aoop);
			p2.add(jl_current_subj);
			p2.add(ta_current_subj);
		p3 = new JPanel(new FlowLayout());  // 성적 비율입력
			add(p3);
			p3.add(jl_chgweight);
			p3.add(tf_weight_mid);
			p3.add(tf_weight_last);
			p3.add(tf_weight_assign);
			p3.add(tf_weight_quiz);
			p3.add(tf_weight_pres);
			p3.add(save);
			p3.add(change);
			p3.add(jl_weight);
		p4 = new JPanel(new FlowLayout()); // 이름 학번 입력
			add(p4);
			p4.add(jl_name);
			p4.add(tf_name);
			p4.add(jl_stunum);
			p4.add(tf_stunum);
			p4.add(jl_subj);
			p4.add(tf_subj);
			
		p5 = new JPanel(new GridLayout(2,6,50,0)); // 성적입력 
			add(p5);
			p5.add(jl_mid);
			p5.add(jl_last);
			p5.add(jl_assign);
			p5.add(jl_quiz);
			p5.add(jl_pres);
			p5.add(jl_total);
			
			p5.add(tf7);
			p5.add(tf8);
			p5.add(tf9);
			p5.add(tf10);
			p5.add(tf11);
			p5.add(tf12);
		p6 = new JPanel(new FlowLayout()); // 버튼 입력 
			add(p6);
			p6.add(calculate);
			p6.add(add);
			p6.add(clear);
		p7 = new JPanel(new GridLayout(5,1)); // 
			p7.add(display);
			p7.add(modify);
			p7.add(delete);
			p7.add(sort);
			p7.add(empty);
		p8 = new JPanel(new GridLayout(1,2,20,0));
			p8.add(jp1);
			p8.add(p7);
			add(p8);			
	}
}