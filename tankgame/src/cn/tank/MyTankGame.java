/**
 * 1.����̹��
 */
package cn.tank;

import javax.swing.*;
import java.awt.*;

public class MyTankGame extends JFrame {
	
	MyPanel mp = null;
	
	public static void main(String[] args) {
		MyTankGame mtk = new MyTankGame();
	}
	//���캯��
	public MyTankGame()
	{
		mp = new MyPanel();
		
		this.add(mp);
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
//�ҵ����--tank�Ļ��
class MyPanel extends JPanel
{
	//����һ���ҵ�tank
	Hero hero = null;
	//���캯��
	public MyPanel()
	{
		hero = new Hero(10,10);
		
	}
	//����paint
	public void paint(Graphics g)
	{
		super.paint(g);
		//��仭����ɫ��
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.getX(),hero.getY(),g,0,1);
		
	}
	//����̹�˵ĺ���
	public void drawTank(int x,int y,Graphics g,int direct,int type)
	{
		//�ж���ʲô���͵�tank
		switch(type){
		case 0:
			g.setColor(Color.CYAN);
			break;
		case 1:
			g.setColor(Color.YELLOW);
		}
		//�жϷ���
		switch(direct)
		{
		//����
		case 0 :
			//����tank
			//1.��ߵľ���
			g.fill3DRect(x,y,5,30,false);
			//2.�ұ߾���
			g.fill3DRect(x+15,y,5,30,false);
			//3.�м����
			g.fill3DRect(x+5,y+5,10,20,false);
			//4.����Բ��
			g.fillOval(x+5,y+10,10,10);
			//5.����
			g.drawLine(x+10,y+15,x+10,y);
		
		break;
		}
		
	}

}


//����һ��̹����
//tank�Ĺ���д�ڸ����У����Ե�tank���Լ̳и���
class Tank
{   //̹�˵ĺ�����
	int x= 0;
	//̹�˵�������
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
	
	//���캯��
	public Tank(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
}

//�����ҵ�̹��
class Hero extends Tank
{
    //��������
	public Hero(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
}
