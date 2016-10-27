package com.demo1;

public class demo {
   public static void main(String []args)
   {
	   
   }
}

interface Fish
{
	public void swimming();
}
interface Bird
{
	public void flying();
}
class Monkey
{
	int age;
	public void jump()
	{
		System.out.println("tiaotiaotiao");
	}
}
class LittleMonkey extends Monkey implements Fish,Bird
{

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub	
	}
	
}
