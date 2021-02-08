import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a no");
		int marks = sc.nextInt();
		
		if(marks>40)
			System.out.println("u have cleared the exam!!!");    //if only one statements
		
		
		System.out.println("after if");
		
		sc.close();
	}

}
