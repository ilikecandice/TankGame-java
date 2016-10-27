package com.demo3;
import java.awt.*;
import javax.swing.*;

public class demo_gui_5 extends JFrame {
	JPanel jp1,jp2,jp3;
	JButton jb1,jb2;
	JLabel jl1,jl2;
	JTextField jtf;
	JPasswordField jpf;
	
	
	public static void main(String[] args)
	{
		demo_gui_5 demo_gui_5 =  new demo_gui_5();
	}
	public demo_gui_5()
	{
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jb1 =  new JButton("确定");
		jb2 =  new JButton("取消");
		
		jl1 = new JLabel("用户名");
		jl2 = new JLabel("密     码");
		
		jtf = new JTextField(10);
		jpf = new JPasswordField(10);
		
		jp1.add(jl1);
		jp1.add(jtf);
	
		jp2.add(jl2);
		jp2.add(jpf);
		
		jp3.add(jb1);
		jp3.add(jb2);
		this.setLayout(new GridLayout(3,1));
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setTitle("复杂布局");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
		
	}

}
