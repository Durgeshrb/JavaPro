import java.util.Scanner;

public class UsingOpDemo {
	//or and not operator

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a no");
		int marks = sc.nextInt();
		
		
		System.out.println("enter grade A or B");
		char grade = sc.next().charAt(0);
		
		
		
		if(marks>40 && marks <=60) {
			System.out.println("u have cleared the exam!!!");    //if more than one statements
			System.out.println("congratulatins!!");         
		}
		else if(marks>60 && marks<=70) {
			System.out.println("u cleard the exam with first class");
		}
		
		//nesting if else
		else if(marks>70) {
			if(grade == 'A') 
			{
				System.out.println("distinction with A grade in sport");
			}else {
				System.out.println("distinction with B grade in sport");
			}
		}
		else {
			System.out.println("less score :(  try next time");
		}
		
		System.out.println("after if");
		
		sc.close();
	}

}
