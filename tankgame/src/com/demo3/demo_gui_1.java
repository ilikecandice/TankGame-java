/**
 * BorderLayout
 * 1.�̳�JFrame
 * 2.������Ҫ�����
 * 3.�������
 * 4.������
 * 5.���ô�������
 */
package com.demo3;
import java.awt.*;
import javax.swing.*;

public class demo_gui_1 extends JFrame {
	//�������
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	  
      public static void main(String[] args)
      {
    	  demo_gui_1 demo_gui_1 = new demo_gui_1();
      }
      public demo_gui_1()
      {   //ʵ�������
    	  jb1 = new JButton("center");
    	  jb2 = new JButton("left");
    	  jb3 = new JButton("right");
    	  jb4 = new JButton("up");
    	  jb5 = new JButton("down");
    	  
    	  //������
    	  //ע�⣺����������������ᱻ���ǣ����ֻ�ܿ���һ��
    	  //this.add(jb1);this.add(jb2);this.add(jb3);
    	  //��Ҫ�ƶ���ӵ�λ��
    	  this.add(jb1, BorderLayout.CENTER);
    	  this.add(jb2, BorderLayout.WEST);
    	  this.add(jb3, BorderLayout.EAST);
    	  this.add(jb4, BorderLayout.NORTH);
    	  this.add(jb5, BorderLayout.SOUTH);
    	  
    	  this.setTitle("�߽粼�ְ���");
    	  this.setSize(300,200);
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    
      }
}

