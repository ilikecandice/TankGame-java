package test;

public class demo_abstract {

}
//抽象类
abstract class Animal
{
	String name;
	int age;
	abstract public void cry();
}
//当一个类继承的父类是抽象类的话，
//需要我们把抽象类中的所有抽象方法全部实现
class Cat extends Animal
{
	public void cry()
	{
		
	}
}
