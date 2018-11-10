package esh;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener{
	public Frame() {
	setTitle("메뉴 구성하기 ");
	makeMenu();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1000,800);
	setVisible(true);
	}
	
	
	void makeMenu(){
	JMenuItem item;
	
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("파일");
	JMenu subj = new JMenu("과목");
	JMenu ratio = new JMenu("비율");
	JMenu stu_manage = new JMenu("학생관리");
	JMenu score_manage = new JMenu("성적관리");
	JMenu statics = new JMenu("통계");
	JMenu view = new JMenu("시각화");
	
	item = new JMenuItem("Save DB");
	item.addActionListener(this);
	file.add(item);
	item = new JMenuItem("Load DB");
	item.addActionListener(this);
	file.add(item);
	item = new JMenuItem("Input CSV");
	item.addActionListener(this);
	file.add(item);
	item = new JMenuItem("Save CSV");
	item.addActionListener(this);
	file.add(item);
	item = new JMenuItem("exit");
	item.addActionListener(this);
	file.add(item);
	
	item = new JMenuItem("webprog");
	item.addActionListener(this);
	subj.add(item);
	item = new JMenuItem("oop");
	item.addActionListener(this);
	subj.add(item);
	item = new JMenuItem("aoop");
	item.addActionListener(this);
	subj.add(item);
	
	item = new JMenuItem("chgweight");
	item.addActionListener(this);
	ratio.add(item);
	item = new JMenuItem("chgratio");
	item.addActionListener(this);
	ratio.add(item);
	
	item = new JMenuItem("Enter stu");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("modify stu");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("delete stu");
	item.addActionListener(this);
	stu_manage.add(item);
	
	item = new JMenuItem("modify score");
	item.addActionListener(this);
	score_manage.add(item);
	item = new JMenuItem("calc grade");
	item.addActionListener(this);
	score_manage.add(item);
	
	item = new JMenuItem("rank");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("average");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Deviation");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort ascending by Score");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort descending by Score");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort by stunum");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Check %");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("View Graph");
	item.addActionListener(this);
	statics.add(item);
	
	
	mb.add(file);
	mb.add(subj);
	mb.add(ratio);
	mb.add(stu_manage);
	mb.add(statics);
	setJMenuBar(mb);
	}
	

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		JMenuItem mi = (JMenuItem) (e.getSource());
		
		switch (mi.getText()) {
		case "Save DB":
			System.out.println("Save DB");
			break;
		case "Load DB":
			System.out.println("Load DB");
			break;
			
			
		case "chgweight":
			JFrame f_chgweight = new JFrame("Chgweight");
			f_chgweight.setSize(500, 150);
			f_chgweight.setVisible(true);
			f_chgweight.setLayout(new GridLayout(3,1,0,0));
			JLabel 	jl_weight = new JLabel("중간       기말       과제       퀴즈       발표       보고서       출결 순입니다.");
			JTextField tf_mid = new JTextField("", 5); // 
			JTextField tf_last = new JTextField("", 5);
			JTextField tf_assign = new JTextField("", 5);
			JTextField tf_quiz = new JTextField("", 5);
			JTextField tf_pres = new JTextField("", 5);
			JTextField tf_report = new JTextField("",5);
			JTextField tf_attend = new JTextField("",5);
			JButton save_chgweight = new JButton("Save");
			save_chgweight.setEnabled(false);
			
			JPanel p1_chgweight = new JPanel(new FlowLayout());
			f_chgweight.add(p1_chgweight);
			p1_chgweight.add(jl_weight);
			
			JPanel p2_chgweight = new JPanel(new FlowLayout());
			f_chgweight.add(p2_chgweight);
			p2_chgweight.add(tf_mid);
			p2_chgweight.add(tf_last);
			p2_chgweight.add(tf_assign);
			p2_chgweight.add(tf_quiz);
			p2_chgweight.add(tf_pres);
			p2_chgweight.add(tf_report);
			p2_chgweight.add(tf_attend);
			
			JPanel p3_chgweight = new JPanel(new FlowLayout());
			f_chgweight.add(p3_chgweight);
			p3_chgweight.add(save_chgweight);
			
			
			
			break;
			
		
		case "Enter stu":
			JFrame f_enter = new JFrame("Enter stu");
			f_enter.setSize(300, 200);
			f_enter.setVisible(true);
			f_enter.setLayout(new GridLayout(3,1,0,0));
			JLabel jl_name_enter = new JLabel("이름");
			JLabel jl_stunum_enter = new JLabel("학번");
			JLabel jl_retake_enter = new JLabel("Retake");
			JLabel jl_unique_enter = new JLabel("Unique");
			JTextField tf_name_enter = new JTextField("", 5); // 이름입력
			JTextField tf_stunum_enter = new JTextField("", 7); // 학번입력 
			JTextField tf_retake_enter = new JTextField("", 2); // 
			JTextField tf_unique_enter = new JTextField("", 7); // 
			JButton save_enter = new JButton("Save");

			
			JPanel p1_enter = new JPanel(new FlowLayout());
			f_enter.add(p1_enter);
			p1_enter.add(jl_name_enter);
			p1_enter.add(tf_name_enter);
			p1_enter.add(jl_stunum_enter);
			p1_enter.add(tf_stunum_enter);
			
			JPanel p2_enter = new JPanel(new FlowLayout());
			f_enter.add(p2_enter);
			p2_enter.add(jl_retake_enter);
			p2_enter.add(tf_retake_enter);
			p2_enter.add(jl_unique_enter);
			p2_enter.add(tf_unique_enter);
			
			JPanel p3_enter = new JPanel(new FlowLayout());
			f_enter.add(p3_enter);
			p3_enter.add(save_enter);

			break;
			
		case "modify stu":
			JFrame f_mod = new JFrame("Enter stu");
			f_mod.setSize(300, 200);
			f_mod.setVisible(true);
			f_mod.setLayout(new GridLayout(3,1,0,0));
			JLabel jl_name_mod = new JLabel("이름");
			JLabel jl_stunum_mod = new JLabel("학번");
			JLabel jl_retake_mod = new JLabel("Retake");
			JLabel jl_unique_mod = new JLabel("Unique");
			JTextField tf_name_mod = new JTextField("", 5); // 이름입력
			JTextField tf_stunum_mod = new JTextField("", 7); // 학번입력 
			JTextField tf_retake_mod = new JTextField("", 2); // 
			JTextField tf_unique_mod = new JTextField("", 7); // 
			JButton search_mod = new JButton("Search");
			JButton mod = new JButton("Modify");

			
			JPanel p1_mod = new JPanel(new FlowLayout());
			f_mod.add(p1_mod);
			p1_mod.add(jl_name_mod);
			p1_mod.add(tf_name_mod);
			p1_mod.add(jl_stunum_mod);
			p1_mod.add(tf_stunum_mod);
			
			JPanel p2_mod = new JPanel(new FlowLayout());
			f_mod.add(p2_mod);
			p2_mod.add(jl_retake_mod);
			p2_mod.add(tf_retake_mod);
			p2_mod.add(jl_unique_mod);
			p2_mod.add(tf_unique_mod);
			
			JPanel p3_mod = new JPanel(new FlowLayout());
			f_mod.add(p3_mod);
			p3_mod.add(mod);
			p3_mod.add(search_mod);
			
			break;
			
		case "delete stu":
			JFrame f_del = new JFrame("Delete stu");
			f_del.setSize(300, 200);
			f_del.setVisible(true);
			f_del.setLayout(new GridLayout(2,1,0,0));
			JLabel jl_name_del = new JLabel("이름");
			JLabel jl_stunum_del = new JLabel("학번");
			JTextField tf_name_del = new JTextField("", 5); // 이름입력
			JTextField tf_stunum_del = new JTextField("", 7); // 학번입력 
			JButton del = new JButton("Delete");

			
			JPanel p1_del = new JPanel(new FlowLayout());
			f_del.add(p1_del);
			p1_del.add(jl_name_del);
			p1_del.add(tf_name_del);
			p1_del.add(jl_stunum_del);
			p1_del.add(tf_stunum_del);
			
			JPanel p2_del = new JPanel(new FlowLayout());
			f_del.add(p2_del);
			p2_del.add(del);

			break;
			
		}
		
	}
	
	public static void main(String[] args) {
		new Frame();
		
	}

}
