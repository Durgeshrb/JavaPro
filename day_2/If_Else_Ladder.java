import java.util.Scanner;

public class If_Else_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a no");
		int marks = sc.nextInt();
		
		if(marks>40 && marks <=60) {
			System.out.println("u have cleared the exam!!!");    //if more than one statements
			System.out.println("congratulatins!!");         
		}
		else if(marks>60 && marks<=70) {
			System.out.println("u cleard the exam with first class");
		}
		else if(marks>70) {
			System.out.println("u cleared the exam with distinction");
		}
		else {
			System.out.println("less score :(  try next time");
		}
		
		System.out.println("after if");
		
		sc.close();

	}

}
