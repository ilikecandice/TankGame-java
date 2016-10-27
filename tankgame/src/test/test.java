package test;
import com.demo.*;

public class test {
	public String name;
	private int age;
	private float salary;
	public test(String name, int age, float salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	 public static void main(String args[]){
		 test p1 = new test("candice",18,230.0f);
		   System.out.println(p1.name);
		   Cat cat1 = new Cat();
		   System.out.println(cat1.age);
	    }
}
