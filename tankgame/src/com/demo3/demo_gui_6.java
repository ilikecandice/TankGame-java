package com.demo3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class demo_gui_6 extends JFrame implements ActionListener{
	//北部区域
	JLabel jl1;
	//南部区域
	JButton jb1,jb2,jb3;
	JPanel jp1;
	//中部区域
	JTabbedPane jtp;//选项卡窗格
	JPanel jp2,jp3,jp4;
	JLabel jl2,jl3,jl4,jl5;
	//号码文本框
	JTextField jtf;
	//密码
	JPasswordField jpf;
	//清除号码button
	JButton jb4;
	//隐身登录
	JCheckBox jcb1,jcb2;
	
	public static void main(String[] args)
	{
		demo_gui_6 demo_gui_6 = new demo_gui_6();
	}
	public demo_gui_6()
	{
		jl2 = new JLabel("QQ号码",JLabel.CENTER);
		jl3 = new JLabel("QQ密码",JLabel.CENTER);
		jl4 = new JLabel("忘记密码",JLabel.CENTER);
		jl4.setFont(new Font("宋体",Font.PLAIN,16));
		jl4.setForeground(Color.BLUE);//设置字体颜色方法；
		jl5 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a></html>");
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//输入号码
		jtf = new  JTextField(10);
		//输入密码
		jpf = new JPasswordField(10);
		//button中可以放照片
		jb4 = new JButton(new ImageIcon("images/clear.gif"));
		//注册监听事件
		jb4.addActionListener(this);
	   
		jcb1 = new JCheckBox("隐身登录");
		jcb2 = new JCheckBox("记住密码");
		
		//北部区域
		jl1 = new JLabel(new ImageIcon("images/tou.gif"));
		//南部区域
		jp1 = new JPanel();
		
		jb3 = new JButton(new ImageIcon("images/quxiao.gif"));
		jb2 = new JButton(new ImageIcon("images/xiangdao.gif"));
		jb1 = new JButton(new ImageIcon("images/denglu.gif"));
		
		
		//中部区域
		jtp = new JTabbedPane();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp3.setBackground(Color.red);
		
		jp4 = new JPanel();
		jp4.setBackground(new Color(0,0,255));
		
		//将面板添加到选项卡窗格上；
		jtp.add("QQ号码",jp2);
		jtp.add("手机号码",jp3);
		jtp.add("电子邮箱",jp4);
		//设置布局
		jp2.setLayout(new GridLayout(3,2));
		
		//添加组价
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.add(jl2);
		jp2.add(jtf);
		jp2.add(jb4);
		jp2.add(jl3);
		jp2.add(jpf);
		jp2.add(jl4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jl5);
		
		this.add(jp1,BorderLayout.SOUTH);
		
		this.add(jl1,BorderLayout.NORTH);
		
		this.add(jtp,BorderLayout.CENTER);
		
		this.setIconImage(new ImageIcon("images/qq.gif").getImage());
		this.setTitle("qq");
		this.setSize(300,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("点击成功");
	}

}
