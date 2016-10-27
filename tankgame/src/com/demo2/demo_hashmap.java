package com.demo2;
import java.util.*;
public class demo_hashmap {
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		Emp emp1 = new Emp("s001","name3",20, 6.2f);
		Emp emp2 = new Emp("s002","name2",21, 7.2f);
		Emp emp3 = new Emp("s003","name1",22, 4.2f);
		hm.put("s001", emp1);//HashMap���Ԫ�أ�hm.put(key,value);
							 //keyֵ�Լ����壬valueΪҪ��ӵĶ���
		hm.put("s002", emp2);
		hm.put("s003", emp3);//HashMap��������ظ���Ԫ�أ������ӣ��ᱻ���ǣ�ֻ����Ψһ��keyֵ
		
		System.out.println(hm.size());//��Ȼ�����3�Σ����ǽ�����2�����s002��valueֵ������
	    //hashMap����key= s002�Ķ���ֵ
		hm.containsKey("s002");//������Ϊbooleanֵ������Ϊtrue������Ϊfalse��
		if(hm.containsKey("s002")){
			Emp temp = (Emp)hm.get("s002");
			System.out.println(temp.getAge());
		}
		
		//hashMap�ı�����Iterator
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
