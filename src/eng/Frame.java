package eng;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener{
	public JTextField tf_current_subj = new JTextField(5);
	public JTextField tf_selectedMenu = new JTextField(10);
	public Map<String, Subject> java = new HashMap<String,Subject>();
	public Subject s;

	
	public Frame() {
	java.put("web", new Subject("web"));
	java.put("oop", new Subject("oop"));
	java.put("aoop", new Subject("aoop"));
	setTitle("aoop proj ");
	setSize(550,800);
	setLayout(new GridLayout(2,1));
	constructLayout();
	makeMenu();
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	JMenu graph = new JMenu("그래프");
	
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
	item = new JMenuItem("Exit");
	item.addActionListener(this);
	file.add(item);
	
	item = new JMenuItem("WEBPROG");
	item.addActionListener(this);
	subj.add(item);
	item = new JMenuItem("OOP");
	item.addActionListener(this);
	subj.add(item);
	item = new JMenuItem("AOOP");
	item.addActionListener(this);
	subj.add(item);
	
	item = new JMenuItem("Chgweight");
	item.addActionListener(this);
	ratio.add(item);
	item = new JMenuItem("Chgratio");
	item.addActionListener(this);
	ratio.add(item);
	
	item = new JMenuItem("Enter stu");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("Modify stu");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("Delete stu");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("Enter Attend");
	item.addActionListener(this);
	stu_manage.add(item);
	item = new JMenuItem("Modify Attend");
	item.addActionListener(this);
	stu_manage.add(item);

	item = new JMenuItem("Enter score");
	item.addActionListener(this);
	score_manage.add(item);
	item = new JMenuItem("Modify score");
	item.addActionListener(this);
	score_manage.add(item);
	item = new JMenuItem("Calc grade");
	item.addActionListener(this);
	score_manage.add(item);
	
	item = new JMenuItem("Rank");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Total");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Mid");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Last");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Quiz");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Pres");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Average of Report");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Deviation");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort ascending by Total Score");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort descending by Total Score");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Sort by stunum");
	item.addActionListener(this);
	statics.add(item);
	item = new JMenuItem("Check %");
	item.addActionListener(this);
	statics.add(item);

	
	item = new JMenuItem("Graph for mid");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for last");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for report");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for quiz");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for pres");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for report");
	item.addActionListener(this);
	graph.add(item);
	item = new JMenuItem("Graph for assent");
	item.addActionListener(this);
	graph.add(item);




	
	
	mb.add(file);
	mb.add(subj);
	mb.add(ratio);
	mb.add(stu_manage);
	mb.add(score_manage);
	mb.add(statics);
	mb.add(graph);
	setJMenuBar(mb);
	}
	void constructLayout() {
		JPanel p1 = new JPanel(new GridLayout(3,1,0,0));
		JPanel p1_1 = new JPanel(new FlowLayout());
		JPanel p1_2 = new JPanel(new FlowLayout());
		JPanel p1_3 = new JPanel(new FlowLayout());
		JLabel jl_current_subj = new JLabel("현재 작업 중인 과목 ");
		JLabel selectedMenu = new JLabel("선택한 메뉴의 결과값");



		add(p1);
		p1.add(p1_1);
		p1_1.add(jl_current_subj);
		p1_1.add(tf_current_subj);
		tf_current_subj.setEnabled(false);
		
		p1.add(p1_2);
		p1_2.add(selectedMenu);
		p1_2.add(tf_selectedMenu);
		tf_selectedMenu.setEnabled(false);

//		JPanel p2 = new JPanel();
//		add(p2);
//		p2.add(new JLabel("2"));
//
//		
		JPanel p3 = new JPanel();
		add(p3);
		
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
		DefaultListModel model = new DefaultListModel();
		JList studentList = new JList(model);
		JScrollPane jp1 = new JScrollPane(studentList);
		studentList.setVisibleRowCount(15);
			//studentList.setFont(f2);
			studentList.setBorder(lineBorder);
		model.addElement("학생의 성적!!!");
		model.addElement( "--------------------------------------------------------------");
		
		p3.add(jp1);
//		JPanel p4 = new JPanel();
//		add(p4); 
//		p4.add(new JLabel("그래프 "));
		
	}
	

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		JMenuItem mi = (JMenuItem) (e.getSource());
		
		// f006
		switch (mi.getText()) {
		case "WEBPROG":
			tf_current_subj.setText("WEBPROG");
			s = java.get("web");
			
			break;
		// f0007	
		case "AOOP":
			tf_current_subj.setText("AOOP");
			s = java.get("aoop");

			break;
		// f0008	
		case "OOP":
			tf_current_subj.setText("OOP");
			s = java.get("oop");

			break;
			
		case "Save DB":
			System.out.println("Save DB");
			break;
			
			
		case "Load DB":
			System.out.println("Load DB");
			break;
			
			
		case "Chgweight":
			new Chgweight(s);
			break;
			
		case "Chgratio":
			new Chgratio(s);
			break;
		
		case "Enter stu":
			new Enterstu(s);
			break;
			
		case "Modify stu":
			new Modifystu(s);
			break;
			
		case "Delete stu":
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
		case "Enter Attend":
			JFrame f_enterattend = new JFrame("Enter Attend");
			f_enterattend.setSize(500, 200);
			f_enterattend.setVisible(true);
			f_enterattend.setLayout(new GridLayout(3,1,0,0));
			JLabel 	jl_enterattend = new JLabel("Enter Attendence in 1~16 Weeks");
			JLabel jl_std_num_enterattend = new JLabel("학번");
			JButton save_enterattend = new JButton("Save");

			
			JTextField tf_std_num_enterattend = new JTextField("",7);
			JTextField tf_w1 = new JTextField("", 1); 
			JTextField tf_w2 = new JTextField("", 1);
			JTextField tf_w3 = new JTextField("", 1);
			JTextField tf_w4 = new JTextField("", 1);
			JTextField tf_w5 = new JTextField("", 1);
			JTextField tf_w6 = new JTextField("", 1);
			JTextField tf_w7 = new JTextField("", 1); // 
			JTextField tf_w8 = new JTextField("", 1); // 
			JTextField tf_w9 = new JTextField("", 1); // 
			JTextField tf_w10 = new JTextField("", 1); // 
			JTextField tf_w11 = new JTextField("", 1);
			JTextField tf_w12 = new JTextField("", 1); 
			JTextField tf_w13 = new JTextField("", 1); 
			JTextField tf_w14 = new JTextField("", 1); 
			JTextField tf_w15 = new JTextField("", 1); // 
			JTextField tf_w16 = new JTextField("", 1); // 
			
			


			
			JPanel p1_enterattend = new JPanel();
			f_enterattend.add(p1_enterattend);
			p1_enterattend.add(jl_enterattend);
			
			JPanel p2_enterattend = new JPanel();
			f_enterattend.add(p2_enterattend);
			p2_enterattend.add(jl_std_num_enterattend);
			p2_enterattend.add(tf_std_num_enterattend);
			p2_enterattend.add(save_enterattend);
			
			JPanel p3_enterattend = new JPanel();
			f_enterattend.add(p3_enterattend);
			p3_enterattend.add(tf_w1);
			p3_enterattend.add(tf_w2);
			p3_enterattend.add(tf_w3);
			p3_enterattend.add(tf_w4);
			p3_enterattend.add(tf_w5);
			p3_enterattend.add(tf_w6);
			p3_enterattend.add(tf_w7);
			p3_enterattend.add(tf_w8);
			p3_enterattend.add(tf_w9);
			p3_enterattend.add(tf_w10);
			p3_enterattend.add(tf_w11);
			p3_enterattend.add(tf_w12);
			p3_enterattend.add(tf_w13);
			p3_enterattend.add(tf_w14);
			p3_enterattend.add(tf_w15);
			p3_enterattend.add(tf_w16);
			
			
			break;
			
		case "Modify Attend":
			JFrame f_modifyattend = new JFrame("Enter Attend");
			f_modifyattend.setSize(500, 200);
			f_modifyattend.setVisible(true);
			f_modifyattend.setLayout(new GridLayout(3,1,0,0));
			JLabel 	jl_modifyattend = new JLabel("Enter Attendence in 1~16 Weeks");
			JLabel jl_std_num_modifyattend = new JLabel("학번");
			JButton save_modifyattend = new JButton("Modify");

			
			JTextField tf_std_num_modifyattend = new JTextField("",7);
			JTextField tf_w1_modifyattend = new JTextField("", 1); 
			JTextField tf_w2_modifyattend = new JTextField("", 1);
			JTextField tf_w3_modifyattend = new JTextField("", 1);
			JTextField tf_w4_modifyattend = new JTextField("", 1);
			JTextField tf_w5_modifyattend = new JTextField("", 1);
			JTextField tf_w6_modifyattend = new JTextField("", 1);
			JTextField tf_w7_modifyattend = new JTextField("", 1); // 
			JTextField tf_w8_modifyattend = new JTextField("", 1); // 
			JTextField tf_w9_modifyattend = new JTextField("", 1); // 
			JTextField tf_w10_modifyattend = new JTextField("", 1); // 
			JTextField tf_w11_modifyattend = new JTextField("", 1); //
			JTextField tf_w12_modifyattend = new JTextField("", 1); // 
			JTextField tf_w13_modifyattend = new JTextField("", 1); // 
			JTextField tf_w14_modifyattend = new JTextField("", 1); // 
			JTextField tf_w15_modifyattend = new JTextField("", 1); // 
			JTextField tf_w16_modifyattend = new JTextField("", 1); // 
			
			
			JPanel p1_modifyattend = new JPanel();
			f_modifyattend.add(p1_modifyattend);
			p1_modifyattend.add(jl_modifyattend);
			
			JPanel p2_modifyattend = new JPanel();
			f_modifyattend.add(p2_modifyattend);
			p2_modifyattend.add(jl_std_num_modifyattend);
			p2_modifyattend.add(tf_std_num_modifyattend);
			p2_modifyattend.add(save_modifyattend);
			
			JPanel p3_modifyattend = new JPanel();
			f_modifyattend.add(p3_modifyattend);
			p3_modifyattend.add(tf_w1_modifyattend);
			p3_modifyattend.add(tf_w2_modifyattend);
			p3_modifyattend.add(tf_w3_modifyattend);
			p3_modifyattend.add(tf_w4_modifyattend);
			p3_modifyattend.add(tf_w5_modifyattend);
			p3_modifyattend.add(tf_w6_modifyattend);
			p3_modifyattend.add(tf_w7_modifyattend);
			p3_modifyattend.add(tf_w8_modifyattend);
			p3_modifyattend.add(tf_w9_modifyattend);
			p3_modifyattend.add(tf_w10_modifyattend);
			p3_modifyattend.add(tf_w11_modifyattend);
			p3_modifyattend.add(tf_w12_modifyattend);
			p3_modifyattend.add(tf_w13_modifyattend);
			p3_modifyattend.add(tf_w14_modifyattend);
			p3_modifyattend.add(tf_w15_modifyattend);
			p3_modifyattend.add(tf_w16_modifyattend);
			
			

			
			break;
		
		case "Enter score":
			
			JFrame f_enterscore = new JFrame("Enter Score");
			f_enterscore.setSize(600, 150);
			f_enterscore.setVisible(true);
			f_enterscore.setLayout(new GridLayout(3,1,0,0));
			JLabel 	jl_weight_enter = new JLabel("중간       기말       과제       퀴즈       발표       보고서       출결 순입니다.");
			JTextField tf_mid_enter = new JTextField("", 5); // 
			JTextField tf_last_enter = new JTextField("", 5);
			JTextField tf_assign_enter = new JTextField("", 5);
			JTextField tf_quiz_enter = new JTextField("", 5);
			JTextField tf_pres_enter = new JTextField("", 5);
			JTextField tf_report_enter = new JTextField("",5);
			JTextField tf_attend_enter = new JTextField("",5);
			JButton save_enterscore = new JButton("Save");
		
			JPanel p1_enterscore = new JPanel(new FlowLayout());
			f_enterscore.add(p1_enterscore);
			p1_enterscore.add(jl_weight_enter);
		
			JPanel p2_enterscore = new JPanel(new FlowLayout());
			f_enterscore.add(p2_enterscore);
			p2_enterscore.add(tf_mid_enter);
			p2_enterscore.add(tf_last_enter);
			p2_enterscore.add(tf_assign_enter);
			p2_enterscore.add(tf_quiz_enter);
			p2_enterscore.add(tf_pres_enter);
			p2_enterscore.add(tf_report_enter);
			p2_enterscore.add(tf_attend_enter);
		
			JPanel p3_enterscore = new JPanel(new FlowLayout());
			f_enterscore.add(p3_enterscore);
			p3_enterscore.add(save_enterscore);

			
			break;
			
		case "Modify score":
			JFrame f_modifyscore = new JFrame("Modify Score");
			f_modifyscore.setSize(600, 150);
			f_modifyscore.setVisible(true);
			f_modifyscore.setLayout(new GridLayout(3,1,0,0));
			JLabel 	jl_weight_modify = new JLabel("중간       기말       과제       퀴즈       발표       보고서       출결 순입니다.");
			JLabel jl_std_num = new JLabel("학번");
			JTextField tf_mid_modify = new JTextField("", 5); // 
			JTextField tf_last_modify = new JTextField("", 5);
			JTextField tf_assign_modify = new JTextField("", 5);
			JTextField tf_quiz_modify = new JTextField("", 5);
			JTextField tf_pres_modify = new JTextField("", 5);
			JTextField tf_report_modify = new JTextField("",5);
			JTextField tf_attend_modify = new JTextField("",5);
			JTextField tf_std_num = new JTextField("",7);
			JButton modifyscore = new JButton("Modify");
		
			JPanel p1_modifyscore= new JPanel(new FlowLayout());
			f_modifyscore.add(p1_modifyscore);
			p1_modifyscore.add(jl_weight_modify);
		
			JPanel p2_modifyscore = new JPanel(new FlowLayout());
			f_modifyscore.add(p2_modifyscore);
			p2_modifyscore.add(tf_mid_modify);
			p2_modifyscore.add(tf_last_modify);
			p2_modifyscore.add(tf_assign_modify);
			p2_modifyscore.add(tf_quiz_modify);
			p2_modifyscore.add(tf_pres_modify);
			p2_modifyscore.add(tf_report_modify);
			p2_modifyscore.add(tf_attend_modify);
		
			JPanel p3_modifyscore = new JPanel(new FlowLayout());
			f_modifyscore.add(p3_modifyscore);
			p3_modifyscore.add(jl_std_num);
			p3_modifyscore.add(tf_std_num);
			p3_modifyscore.add(modifyscore);
			
			break;
		
		case "Graph for mid":
			new Gragh();
			
	        break;
	        
	        
		case "Graph for last":
		
			break;
		}
		
	}
	
}
