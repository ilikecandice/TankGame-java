package com.demo2;

import java.lang.reflect.Method;
import java.io.*;

public class demo_fanxing {
  public static void main(String[] args)
  {   
	  FileReader fr = null;
		try{
			//ִ����䣻
			fr = new FileReader("D:\\test.txt");
			
			}
		catch(Exception e){
			  e.printStackTrace();
			System.out.println(e.getMessage());
			}
		finally{
			//  ������飬������û���쳣����ִ�У�
			//һ��˵����Ҫ�رյ���Դ�������ļ�����
			//�����ӣ����ٵ��ڴ棬�ͷŵ��������
			if(fr !=null){
				try{
				  fr.close();
				}catch(Exception e){
				 System.out.println(e.getMessage());
				}
			}
		}

	  
	  
	  //������������
	  Gen<String> gen1 = new Gen<String>("aa");
	 // gen1.showTypeName();
	  
	  Gen<Integer> gen2 = new Gen<Integer>(1);
	  //gen2.showTypeName();
	  //��
	  Gen<Bird> gen3 = new Gen<Bird>(new Bird());
	  gen3.showTypeName();
  }
}
//����һ��bird��
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
//����
class Gen<T>
{
	private T o;
	//���캯��
	public Gen(T a)
	{
		o = a;
	}
	//��Ա����
	public void showTypeName()
	{
		System.out.println("������"+ o.getClass().getName());
		//ͨ��������ƣ����ǿ��Եõ�T������͵ĺܶ���Ϣ�����磺�������ƣ��������ͣ���Ա��������Ա����	
		//����õ���Ա�����ĺ�����
		Method []m = o.getClass().getDeclaredMethods();
		//System.out.println(m[0].getClass());
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i].getName());
		}
	}
}
