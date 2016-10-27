package com.demo;

public class demo_override {
	public static void main(String[] args)
	{
		Animal1 a1 = new Dog();
		a1.cry();//Êä³öÍôÍô½Ğ
		a1 = new Pig();
		a1.cry();//Êä³ö¶¯Îï½Ğ
	}

}
class Animal1
{  
	int age;
    String name;
    public void cry()
    {
    	System.out.println("¶¯Îï½Ğ");
    }
}
class Dog extends Animal1
{
	public void cry()
    {
    	System.out.println("ÍôÍô½Ğ");
    }
}
class Pig extends Animal1
{
	public void cry()
    {
    	System.out.println("ºßºß½Ğ");
    }
}

