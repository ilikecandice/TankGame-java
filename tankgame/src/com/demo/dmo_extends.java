package com.demo;

public class dmo_extends {
	public static void main(String[] args)
	{
		PupilStu st1 = new PupilStu();
		st1.printName();//�̳��Ը���
		
	}

}
class Stu 
{
	public int age;
	public String name;
	float fee;
	public void printName()
	{
		System.out.println(this.name);
	}
}

class PupilStu extends Stu
{ 
	public void pay(float fee)
	{
	   this.fee = fee;	
	}
}
