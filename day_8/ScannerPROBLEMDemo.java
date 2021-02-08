package day_8;
import java.util.*;
public class ScannerPROBLEMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		System.out.println("name = "+name);
		
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("age = "+age);
		
		System.out.println("enter adrress");
		sc.nextLine();              //extra nextLine() 
		String add = sc.nextLine();
		System.out.println("address = "+add);
		sc.close();
	}

}
