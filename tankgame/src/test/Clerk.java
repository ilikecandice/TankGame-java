package test;

public class Clerk {
	
	 public static void main(String args[]){
		 
		 Clerk1 p1 = new Clerk1("candice",18,230.0f);
		   System.out.println(p1.name);
		   //System.out.println(p1.age);
		   System.out.println(p1.getSal());
		   
	    }
}

class Clerk1
{
	public String name;
	private int age;
	private float salary;
	public Clerk1(String name, int age, float salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	//通过成员方法去控制和访问私有的属性
	public float getSal()
	{
		return this.salary;
	}
}