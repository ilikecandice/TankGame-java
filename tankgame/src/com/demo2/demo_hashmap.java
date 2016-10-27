package com.demo2;
import java.util.*;
public class demo_hashmap {
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		Emp emp1 = new Emp("s001","name3",20, 6.2f);
		Emp emp2 = new Emp("s002","name2",21, 7.2f);
		Emp emp3 = new Emp("s003","name1",22, 4.2f);
		hm.put("s001", emp1);//HashMap添加元素，hm.put(key,value);
							 //key值自己定义，value为要添加的对象
		hm.put("s002", emp2);
		hm.put("s003", emp3);//HashMap不能添加重复的元素，如果添加，会被覆盖，只能有唯一的key值
		
		System.out.println(hm.size());//虽然添加了3次，但是结果输出2，编号s002的value值被覆盖
	    //hashMap查找key= s002的对象值
		hm.containsKey("s002");//输出结果为boolean值，存在为true，否则为false；
		if(hm.containsKey("s002")){
			Emp temp = (Emp)hm.get("s002");
			System.out.println(temp.getAge());
		}
		
		//hashMap的遍历，Iterator
		Iterator it = hm.keySet().iterator();
		//it.hasNext();
		while(it.hasNext()){
			String key = it.next().toString();
			Emp temp = (Emp)hm.get(key);
			System.out.println(temp.getName());
			System.out.println(temp.getSal());
		}
	}

}
class Emp
{  private String empNum;
   private String name;
   private int age;
   private float sal;
   
   public Emp(String empNum, String name,int age ,float sal)
   {
	   this.empNum = empNum;
	   this.name = name;
	   this.age = age;
	   this.sal = sal;
   }
   public String getEmpNum() {
		return empNum;
	}
   public void setEmpNum(String empNum) {
		this.empNum = empNum;
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
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
   
	}
