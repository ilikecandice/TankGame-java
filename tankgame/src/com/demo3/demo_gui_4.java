/**
 * ���ֲ��ֹ�������ʹ��
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
		//�������
		//JPanel����Ĭ����FlowLayout��
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("����");
		jb2 = new JButton("ƻ��");
		jb3 = new JButton("��֦");
		jb4 = new JButton("����");
		jb5 = new JButton("����");
		jb6 = new JButton("�㽶");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//��Panel����JFrame��
		this.add (jp1,BorderLayout.NORTH);
		
		//���㽶�����м�λ�ã�
		this.add(jb6,BorderLayout.CENTER);
		
		//��panel2�����ϱߣ�
		this.add(jp2, BorderLayout.SOUTH);
		
		this.setTitle("���Ӳ���");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	

}
