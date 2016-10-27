package com.demo2;

import java.lang.reflect.Method;
import java.io.*;

public class demo_fanxing {
  public static void main(String[] args)
  {   
	  FileReader fr = null;
		try{
			//执行语句；
			fr = new FileReader("D:\\test.txt");
			
			}
		catch(Exception e){
			  e.printStackTrace();
			System.out.println(e.getMessage());
			}
		finally{
			//  这个语句块，不管有没有异常都会执行；
			//一般说把需要关闭的资源，比如文件，开
			//的链接，开辟的内存，就放到这个块中
			if(fr !=null){
				try{
				  fr.close();
				}catch(Exception e){
				 System.out.println(e.getMessage());
				}
			}
		}

	  
	  
	  //基本数据类型
	  Gen<String> gen1 = new Gen<String>("aa");
	 // gen1.showTypeName();
	  
	  Gen<Integer> gen2 = new Gen<Integer>(1);
	  //gen2.showTypeName();
	  //类
	  Gen<Bird> gen3 = new Gen<Bird>(new Bird());
	  gen3.showTypeName();
  }
}
//定义一个bird类
class Bird
{
	public void show()
	{
		System.out.println("aa");
		
	}
	public void count(int a,int b)
	{
		System.out.println(a+b);
	}
}
//泛型
class Gen<T>
{
	private T o;
	//构造函数
	public Gen(T a)
	{
		o = a;
	}
	//成员方法
	public void showTypeName()
	{
		System.out.println("类型是"+ o.getClass().getName());
		//通过反射机制，我们可以得到T这个类型的很多信息，比如：函数名称，返回类型，成员变量，成员方法	
		//比如得到成员函数的函数名
		Method []m = o.getClass().getDeclaredMethods();
		//System.out.println(m[0].getClass());
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getName());
		}
	}
}
