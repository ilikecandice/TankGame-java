package com.demo;

public class demo_override {
	public static void main(String[] args)
	{
		Animal1 a1 = new Dog();
		a1.cry();//���������
		a1 = new Pig();
		a1.cry();//��������
	}

}
class Animal1
{  
	int age;
    String name;
    public void cry()
    {
    	System.out.println("�����");
    }
}
class Dog extends Animal1
{
	public void cry()
    {
    	System.out.println("������");
    }
}
class Pig extends Animal1
{
	public void cry()
    {
    	System.out.println("�ߺ߽�");
    }
}

