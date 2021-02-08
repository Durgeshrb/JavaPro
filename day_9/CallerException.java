package day_9;

import java.util.Scanner;

public class CallerException {
	
	static void method1()
	{
		try {
			
			int arr[] ={1,2,3};
			System.out.println("arr of 4= " + arr[4]);
			
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("plas use proper index 0 to length-1");
			}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			
		method1();
		
		System.out.println("enter 2 int");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int z = i/j;        //throw new ArithmeticException();
		System.out.println("z  =  " +z);
		}catch(ArithmeticException e)
		{
			try {

			System.out.println("j should be greater than 0.... plz enter valid value");
			}catch(Exception e1)
			{
				System.out.println("in nested catch of catch");
			}
		}
		
		
		
		catch(Exception e)
		{
			System.out.println("in exception catch block");
		}
		
		
		sc.close();

	}


}
