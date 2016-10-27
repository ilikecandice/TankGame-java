package com.demo3;

import java.awt.*;
import javax.swing.*;

public class demo_gui_3 extends JFrame {
	int size = 9;
	JButton jbs[] = new JButton[size];
	
	public static void main(String[] args)
	{
		demo_gui_3 demo_gui_3 = new demo_gui_3();
	}
	public demo_gui_3()
	{ 
		for(int i = 0;i<size;i++)
		{
			jbs[i]=new JButton(String.valueOf(i));
		}
		this.setLayout(new GridLayout(3,3));
		for(int i = 0;i<size;i++)
		{
			this.add(jbs[i]);
			
		}
		this.setTitle("GridLayout");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
