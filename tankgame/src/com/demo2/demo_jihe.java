package com.demo2;
import java.util.*;

public class demo_jihe {
    public static void main(String []args)
    {
    	//ArrayList al = new ArrayList();
    	ArrayList<Clerk> al = new ArrayList<Clerk>();
    	System.out.println(al.size());
    	Clerk clerk1 = new Clerk("name1",20,1000);
    	Clerk clerk2 = new Clerk("name2",19,1100);
    	al.add(clerk1);
    	al.add(clerk2);
    	al.add(clerk1);//ArrayList ��������ظ���Ԫ�أ�
    	System.out.println(al.size());
    	
    	Clerk temp = (Clerk)al.get(0);//��ȡal�еĵ�һ��Ԫ��
    	
    	System.out.println(temp.getName());//��ȡal�е�һ��Ԫ�ص�nameֵ
    	
    }
}
class Clerk
{  private String name;
	private int age;
	private float salary;
	public Clerk(String name,int age,float salary)
	{
		this.name =  name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

   
	}
