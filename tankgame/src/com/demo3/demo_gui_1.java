/**
 * BorderLayout
 * 1.继承JFrame
 * 2.定义需要的组件
 * 3.创建组件
 * 4.添加组件
 * 5.设置窗体属性
 */
package com.demo3;
import java.awt.*;
import javax.swing.*;

public class demo_gui_1 extends JFrame {
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	  
      public static void main(String[] args)
      {
    	  demo_gui_1 demo_gui_1 = new demo_gui_1();
      }
      public demo_gui_1()
      {   //实例化组件
    	  jb1 = new JButton("center");
    	  jb2 = new JButton("left");
    	  jb3 = new JButton("right");
    	  jb4 = new JButton("up");
    	  jb5 = new JButton("down");
    	  
    	  //添加组件
    	  //注意：如果这样添加组件，会被覆盖，最后只能看见一个
    	  //this.add(jb1);this.add(jb2);this.add(jb3);
    	  //需要制定添加的位置
    	  this.add(jb1, BorderLayout.CENTER);
    	  this.add(jb2, BorderLayout.WEST);
    	  this.add(jb3, BorderLayout.EAST);
    	  this.add(jb4, BorderLayout.NORTH);
    	  this.add(jb5, BorderLayout.SOUTH);
    	  
    	  this.setTitle("边界布局案例");
    	  this.setSize(300,200);
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    
      }
}

