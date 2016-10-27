package com.demo3;

import java.awt.*;
import javax.swing.*;

public class demo_gui_8 extends JFrame {
	MyPanel mp= null;
   public static void main(String []args)
   {
	   demo_gui_8 demo_gui_8 = new demo_gui_8();
   }
   public demo_gui_8()
   {
	   mp = new MyPanel();
	   this.add(mp);
	   this.setSize(400,300);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);  
   }
   
   
   //定义一个面板，用于绘图和实现绘图的区域
   class MyPanel extends JPanel
   {
	   //覆盖JPanel的paint方法
	   //Graphics是绘图的重要类，可以理解成一只画笔
	   public void paint(Graphics g)
	   {
		   //调用父类函数完成初始化
		   super.paint(g);
		   //画图
		   g.drawOval(10, 10, 100, 100);
		   
	   }
   }
	
}
