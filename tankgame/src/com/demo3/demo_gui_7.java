package com.demo3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo_gui_7 extends JFrame implements ActionListener{
	//菜单条组件
	JMenuBar jmb;
	JMenu menu1,menu2,menu3,menu4,menu5;
	JMenuItem item1,item2,item3,item4,item5,item6,item7,item8;
	//二级菜单
	JMenu xinjian;
	JMenuItem file,project;
	JTextArea jta;
	//工具条
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	
	public static void main(String[] args)
	{
		demo_gui_7 demo_gui_7 = new demo_gui_7();
	}
	public demo_gui_7()
	{
		//创建组件
		jtb = new JToolBar();
		jb1 = new JButton("New");
		jb1.setToolTipText("新建");
		jb2 = new JButton("Open");
		jb3 = new JButton("Save");
		jb4 = new JButton("Copy");
		jb5 = new JButton("Cut");
		jb6 = new JButton("Paste");
		
		jmb = new JMenuBar();
		menu1 = new JMenu("文件(F)");
		menu2 = new JMenu("编辑(E)");
		menu3 = new JMenu("格式(O)");
		menu4 = new JMenu("查看(S)");
		menu5 = new JMenu("帮助(H)");
		
		
		
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
