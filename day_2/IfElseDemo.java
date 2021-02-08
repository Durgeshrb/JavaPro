import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a no");
		int marks = sc.nextInt();
		
		if(marks>40) {
			System.out.println("u have cleared the exam!!!");    //if more than one statements
			System.out.println("congratulatins!!");         
		}else {
			System.out.println("less score :(  try next time");
		}
		
		System.out.println("after if");
		
		sc.close();
	}
	

}
