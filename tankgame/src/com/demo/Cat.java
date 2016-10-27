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
{   //声明两个方法；
	public void start();
	public void stop();
}
//编写照相机类，并实现Usb接口
//一个重要原则，当一个类实现了一个接口，就要求该类把这个接口的所有方法统统实现；
class Camera implements Usb
{
	public void start()
	{
		System.out.println("相机开始工作");
	}
	public void stop()
	{
		System.out.println("相机结束工作");
	}
}
//编写手机类
class Phone implements Usb
{
	public void start()
	{
		System.out.println("shouji开始工作");
	}
	public void stop()
	{
		System.out.println("shouji结束工作");
	}
}
//编写计算机类
class Computer
{
	public void useUsb(Usb usb)
	{
		usb.start();
		usb.stop();
	}
	
}


