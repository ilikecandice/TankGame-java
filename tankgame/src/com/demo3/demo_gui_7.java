package com.demo3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo_gui_7 extends JFrame implements ActionListener{
	//�˵������
	JMenuBar jmb;
	JMenu menu1,menu2,menu3,menu4,menu5;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8;
	//�����˵�
	JMenu xinjian;
	JMenuItem file,project;
	JTextArea jta;
	//������
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	
	public static void main(String[] args)
	{
		demo_gui_7 demo_gui_7 = new demo_gui_7();
	}
	public demo_gui_7()
	{
		//�������
		jtb = new JToolBar();
		jb1 = new JButton("New");
		jb1.setToolTipText("�½�");
		jb2 = new JButton("Open");
		jb3 = new JButton("Save");
		jb4 = new JButton("Copy");
		jb5 = new JButton("Cut");
		jb6 = new JButton("Paste");
		
		jmb = new JMenuBar();
		menu1 = new JMenu("�ļ�(F)");
		menu2 = new JMenu("�༭(E)");
		menu3 = new JMenu("��ʽ(O)");
		menu4 = new JMenu("�鿴(S)");
		menu5 = new JMenu("����(H)");
		
		
		
		this.setIconImage(new ImageIcon("images/qq.gif").getImage());
		this.setTitle("qq");
		this.setSize(300,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}

}
