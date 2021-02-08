package day_9;

import java.util.*;
public class CheckedUnchecked{
	Scanner sc = new Scanner(System.in);
	
	
	
	void getMarks() throws ClassNotFoundException
	{
		System.out.println("enter  marks");
		int marks = sc.nextInt();
		
//		try {
		if(marks > 100 || marks < 0) 
			throw new ClassNotFoundException();         //throw exception
			
		System.out.println("You have scored marks = "+marks);
//		}catch(ArithmeticException e)
//		{
//			System.out.println("marks should be in the range of 0 to 100...please enter proper marks");
//		}
			
		
		sc.close();
		
		
	}
	
	
	public static void main(String[] args)throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		CheckedUnchecked d = new CheckedUnchecked();
//		try {
		
		d.getMarks();
		
//		}catch(ClassNotFoundException e )
//		{
//			System.out.println("enter proper marks");
//		}
	}

}


