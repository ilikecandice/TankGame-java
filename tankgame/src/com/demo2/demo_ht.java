package com.demo2;
import java.util.*;
public class demo_ht {

}
class Per
{
	   private String empNum;
	   private String name;
	   private int age;
	   private float sal;
	   
	   public Per(String empNum, String name,int age ,float sal)
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