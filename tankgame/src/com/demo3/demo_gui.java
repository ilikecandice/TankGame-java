package com.demo3;
import java.awt.*;
import javax.swing.*;
public class demo_gui extends JFrame {
	//1.�ڴ˴���������Ҫ��swing���
	JButton jb1 = null;
	
	public static void main(String[] args)
	{  
		demo_gui demo_gui = new demo_gui();
		 
	}
	
	//���캯��
	public demo_gui()
	{
		//2.�ڹ��캯���д�������ʼ�����
		//����һ��button��ť
		jb1 = new JButton("���ǰ�ť");
		//3.����������������
		//��button��ӵ�jf��
		this.add(jb1);
		
		//4.���ô��ڵ���ʽ����С�ȵ�
		//���������ñ���
		this.setTitle("hello world");
		//���ô����С�������أ�1px=1cm��
		this.setSize(200, 200);
		//���رմ��ڵ�ʱ�򣬱�֤jvmҲ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//5.������ʾ
		//��ʾ���ڣ���������ã�������ʾ������
		this.setVisible(true);
	}

}
