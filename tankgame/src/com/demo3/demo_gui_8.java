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
   
   
   //����һ����壬���ڻ�ͼ��ʵ�ֻ�ͼ������
   class MyPanel extends JPanel
   {
	   //����JPanel��paint����
	   //Graphics�ǻ�ͼ����Ҫ�࣬��������һֻ����
	   public void paint(Graphics g)
	   {
		   //���ø��ຯ����ɳ�ʼ��
		   super.paint(g);
		   //��ͼ
		   g.drawOval(10, 10, 100, 100);
		   
	   }
   }
	
}
