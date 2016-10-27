package com.demo3;
import java.awt.*;
import javax.swing.*;
public class demo_gui extends JFrame {
	//1.在此处定义所需要的swing组件
	JButton jb1 = null;
	
	public static void main(String[] args)
	{  
		demo_gui demo_gui = new demo_gui();
		 
	}
	
	//构造函数
	public demo_gui()
	{
		//2.在构造函数中创建，初始化组件
		//创建一个button按钮
		jb1 = new JButton("我是按钮");
		//3.创建结束后添加组件
		//将button添加到jf中
		this.add(jb1);
		
		//4.设置窗口的样式，大小等等
		//给窗体设置标题
		this.setTitle("hello world");
		//设置窗体大小，按像素（1px=1cm）
		this.setSize(200, 200);
		//当关闭窗口的时候，保证jvm也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//5.窗口显示
		//显示窗口，如果不设置，窗口显示不出来
		this.setVisible(true);
	}

}
