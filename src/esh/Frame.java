package esh;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

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
	stu_manage.add(item);
	item = new JMenuItem("chgwratio");
	item.addActionListener(this);
	ratio.add(item);
	
	item = new JMenuItem("Enter stu");
	item.addActionListener(this);
	item.add(stu_manage);
	item = new JMenuItem("modifiy stu");
	item.addActionListener(this);
	item.add(stu_manage);
	item = new JMenuItem("delete stu");
	item.addActionListener(this);
	item.add(stu_manage);
	
	item = new JMenuItem("modify score");
	item.addActionListener(this);
	item.add(score_manage);
	item = new JMenuItem("calc grade");
	item.addActionListener(this);
	item.add(score_manage);
	
	item = new JMenuItem("rank");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("average");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("Deviation");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("Sort ascending by Score");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("Sort descending by Score");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("Sort by stunum");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("Check %");
	item.addActionListener(this);
	item.add(statics);
	item = new JMenuItem("View Graph");
	item.addActionListener(this);
	item.add(statics);
	
	
	
	
	
	
	
	
	mb.add(file);
	mb.add(subj);
	mb.add(ratio);
	mb.add(stu_manage);
	mb.add(statics);
	setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new Frame();
	}

}
