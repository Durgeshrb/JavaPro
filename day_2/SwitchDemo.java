import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a month number");
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("Ma");
			break;

			
		
		default : 
			System.out.println("wrong input!!");
			
		}
		
		sc.close();
		
	}

}
