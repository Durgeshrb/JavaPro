package day_13;
import java.util.*;
//import java.util.ArrayList;


public class StudentPrivateArray {
	static String a1;
	static Scanner sc = new Scanner(System.in);
	static String setNames()
	{
		System.out.println("enter name of student");
		String s1 = sc.next();
		
		return s1;
	}
	
//	static void searchName(String name)
//	{
//		System.out.println(a1.contains(name));
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<String>  a1 =new ArrayList<>();
		
		do {
			System.out.println("enter 1 for insert element..\n2 for display elements\n3 for search student by name  ....\n0 for exit");
			int ch = sc.nextInt();
		if(ch == 1)	
			a1.add( setNames());

		else if(ch == 2) {
		Iterator<String> i = a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		}
//		
//		else if (ch == 3)
//		{
//			System.out.println("enter name of student");
//			String s1 = sc.next();
//			searchName(s1);
//		}
		
		else if(ch == 0)
			break;
		
		
		
		}while(true);
		
	}

}
