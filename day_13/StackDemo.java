package day_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s =new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("stck elements");
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		s.pop();
		System.out.println("after poping");
		i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
