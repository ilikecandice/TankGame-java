package com.demo3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class demo_gui_6 extends JFrame implements ActionListener{
	//��������
	JLabel jl1;
	//�ϲ�����
	JButton jb1,jb2,jb3;
	JPanel jp1;
	//�в�����
	JTabbedPane jtp;//ѡ�����
	JPanel jp2,jp3,jp4;
	JLabel jl2,jl3,jl4,jl5;
	//�����ı���
	JTextField jtf;
	//����
	JPasswordField jpf;
	//�������button
	JButton jb4;
	//�����¼
	JCheckBox jcb1,jcb2;
	
	public static void main(String[] args)
	{
		demo_gui_6 demo_gui_6 = new demo_gui_6();
	}
	public demo_gui_6()
	{
		jl2 = new JLabel("QQ����",JLabel.CENTER);
		jl3 = new JLabel("QQ����",JLabel.CENTER);
		jl4 = new JLabel("��������",JLabel.CENTER);
		jl4.setFont(new Font("����",Font.PLAIN,16));
		jl4.setForeground(Color.BLUE);//����������ɫ������
		jl5 = new JLabel("<html><a href='www.qq.com'>�������뱣��</a></html>");
		jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//�������
		jtf = new  JTextField(10);
		//��������
		jpf = new JPasswordField(10);
		//button�п��Է���Ƭ
		jb4 = new JButton(new ImageIcon("images/clear.gif"));
		//ע������¼�
		jb4.addActionListener(this);
	   
		jcb1 = new JCheckBox("�����¼");
		jcb2 = new JCheckBox("��ס����");
		
		//��������
		jl1 = new JLabel(new ImageIcon("images/tou.gif"));
		//�ϲ�����
		jp1 = new JPanel();
		
		jb3 = new JButton(new ImageIcon("images/quxiao.gif"));
		jb2 = new JButton(new ImageIcon("images/xiangdao.gif"));
		jb1 = new JButton(new ImageIcon("images/denglu.gif"));
		
		
		//�в�����
		jtp = new JTabbedPane();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp3.setBackground(Color.red);
		
		jp4 = new JPanel();
		jp4.setBackground(new Color(0,0,255));
		
		//�������ӵ�ѡ������ϣ�
		jtp.add("QQ����",jp2);
		jtp.add("�ֻ�����",jp3);
		jtp.add("��������",jp4);
		//���ò���
		jp2.setLayout(new GridLayout(3,2));
		
		//������
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
		System.out.println("����ɹ�");
	}

}
