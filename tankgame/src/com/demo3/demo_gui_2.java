package com.demo3;
import java.awt.*;
import javax.swing.*;

public class demo_gui_2 extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args)
	{
		demo_gui_2 demo_gui_2 = new demo_gui_2();
	}
	
	public demo_gui_2()
	{
		jb1 = new JButton("jb1");
		jb2 = new JButton("jb2");
		jb3 = new JButton("jb3");
		jb4 = new JButton("jb4");
		jb5 = new JButton("jb5");
		jb6 = new JButton("jb6");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		//��ʽ����Ĭ���Ǿ��ж����
		//this.setLayout(new FlowLayout(������������������ö��뷽ʽ));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));//�����
		
	    this.setTitle("FlowLayout");
	    this.setSize(300, 200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
		
	}

}
