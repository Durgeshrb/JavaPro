package day_12;

import static java.lang.Math.*;
public class AddedFeatures {
	
	
	static void method2(Integer z)
	{
		int a = 100 + z;
		System.out.println("a =" + a);
	}
	
	static void method1(int j,int...i)
	{
		System.out.println("in method1");
		for (int z:i)
		{
			System.out.println(z);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(min(10,20));

		double arr[] = {12,45,78,98};
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(double var : arr)
		{
			System.out.println("var = "+ var);
		}
		
		
		method1(10,20,30);
		method1(11,12,13,14,15);
		method1(1);
		
		
		int z = 100;
		Integer z1 = new Integer(z);
		
		String str = "1234";
		int a = Integer.parseInt(str);
		
		System.out.println(Integer.toBinaryString(z1));
		
		
		method2(123);
		
	}

}
