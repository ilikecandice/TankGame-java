/**
 * 1.画出坦克
 */
package cn.tank;

import javax.swing.*;
import java.awt.*;

public class MyTankGame extends JFrame {
	
	MyPanel mp = null;
	
	public static void main(String[] args) {
		MyTankGame mtk = new MyTankGame();
	}
	//构造函数
	public MyTankGame()
	{
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
//我的面板--tank的活动区
class MyPanel extends JPanel
{
	//定义一个我的tank
	Hero hero = null;
	//构造函数
	public MyPanel()
	{
		hero = new Hero(10,10);
		
	}
	//重新paint
	public void paint(Graphics g)
	{
		super.paint(g);
		//填充画板颜色；
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.getX(),hero.getY(),g,0,1);
		
	}
	//画出坦克的函数
	public void drawTank(int x,int y,Graphics g,int direct,int type)
	{
		//判断是什么类型的tank
		switch(type){
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.YELLOW);
		}
		//判断方向
		switch(direct)
		{
		//向上
		case 0 :
			//绘制tank
			//1.左边的矩形
			g.fill3DRect(x,y,5,30,false);
			//2.右边矩形
			g.fill3DRect(x+15,y,5,30,false);
			//3.中间矩形
			g.fill3DRect(x+5,y+5,10,20,false);
			//4.画出圆形
			g.fillOval(x+5,y+10,10,10);
			//5.画线
			g.drawLine(x+10,y+15,x+10,y);
		
		break;
		}
		
	}

}


//定义一个坦克类
//tank的共性写在父类中，各自的tank可以继承父类
class Tank
{   //坦克的横坐标
	int x= 0;
	//坦克的纵坐标
	int y = 0;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//构造函数
	public Tank(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}

//定义我的坦克
class Hero extends Tank
{
    //？？？？
	public Hero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
}
