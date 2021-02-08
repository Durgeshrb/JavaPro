import java.util.Scanner;

public class CalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner(System.in);
		
		int result;
		char cont;
		do{
			System.out.println("enter operation");
			char operation = sc.next().charAt(0);
			
			System.out.println("enter number 1");
			int num1 = sc.nextInt();
			
			System.out.println("enter number 2");
			int num2 = sc.nextInt();
			
			switch(operation) {
			case '+' :
				result = num1 + num2;
				System.out.println("addition is" + result);
				break;
			case '-' :
				result = num1 - num2;
				System.out.println("subtraction is" + result);
				break;
			
			case '*' :
				result = num1 * num2;
				System.out.println("mul is" + result);
				break;
				
			case '/' :
				result = num1 / num2;
				System.out.println("division is" + result);
				break;
				
			}
			
			System.out.println("do you want to continue? (y/n)");
			cont = sc.next().charAt(0);
			
		}while(cont == 'y');
	}

}
