package day_9;
import java.util.*;
public class ThrowClauseDemo {
	Scanner sc = new Scanner(System.in);
	
	
	
	void getMarks() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		System.out.println("enter  marks");
		int marks = sc.nextInt();
		System.out.println("enter proper marks");
//		try {
		if(marks > 100 || marks < 0) 
			throw new ArithmeticException();         //throw exception
			
			System.out.println("You have scored marks = "+marks);
//		}catch(ArithmeticException e)
//		{
//			System.out.println("marks should be in the range of 0 to 100...please enter proper marks");
//		}
			
		
		sc.close();
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowExceDemo d = new ThrowExceDemo();
		try {
		
		d.getMarks();
		
		}catch(ArithmeticException e )
		{
			System.out.println("enter proper marks");
		}
	}

}
