package com.demo;

public class Cat {
	public static void mian(String []args)
    {
    	Camera camera = new Camera();
    	Phone phone = new Phone();
    	Computer computer = new Computer();
    	computer.useUsb(camera);
    	computer.useUsb(phone);
    }
}
interface Usb
{   //��������������
	public void start();
	public void stop();
}
//��д������࣬��ʵ��Usb�ӿ�
//һ����Ҫԭ�򣬵�һ����ʵ����һ���ӿڣ���Ҫ����������ӿڵ����з���ͳͳʵ�֣�
class Camera implements Usb
{
	public void start()
	{
		System.out.println("�����ʼ����");
	}
	public void stop()
	{
		System.out.println("�����������");
	}
}
//��д�ֻ���
class Phone implements Usb
{
	public void start()
	{
		System.out.println("shouji��ʼ����");
	}
	public void stop()
	{
		System.out.println("shouji��������");
	}
}
//��д�������
class Computer
{
	public void useUsb(Usb usb)
	{
		usb.start();
		usb.stop();
	}
	
}


