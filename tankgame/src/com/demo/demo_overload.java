package com.demo;

public class demo_overload {
	public static void mian(String[] args)
	{
		Abc abc = new Abc();
		abc.getMax(1.2f, 1.3f);
		abc.getMax(1,2);
	}

}

class Abc
{  
	public int getMax(int i ,int j)
	{
		return i>j?i:j;
	}
	public float getMax(float s, float m)
	{
		return s>m?s:m;
	}
	//���ֻ�Ƿ������Ͳ�ͬ�����ܹ�������     ����
	/*public double getMax(float s, float m)
	{
		return s>m?s:m;
	}*/
	//���ֻ�ǿ��Ʒ������η���ͬ�����ܹ�������     ����
	/*protected float getMax(float s, float m)
	{
		return s>m?s:m;

     }*/
}