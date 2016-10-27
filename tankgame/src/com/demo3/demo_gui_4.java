/**
 * 多种布局管理器的使用
 */
package com.demo3;
import java.awt.*;
import javax.swing.*;

public class demo_gui_4 extends JFrame {
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	
	
	public static void main(String[] args)
	{
		demo_gui_4 demo_gui_4 = new demo_gui_4();
	}
	
	public demo_gui_4()
	{
		//创建组件
		//JPanel布局默认是FlowLayout；
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("西瓜");
		jb2 = new JButton("苹果");
		jb3 = new JButton("荔枝");
		jb4 = new JButton("葡萄");
		jb5 = new JButton("桔子");
		jb6 = new JButton("香蕉");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//把Panel加入JFrame；
		this.add (jp1,BorderLayout.NORTH);
		
		//把香蕉放在中间位置；
		this.add(jb6,BorderLayout.CENTER);
		
		//把panel2放在南边；
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setTitle("复杂布局");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	

}
