import java.util.Scanner;

public class ReadCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter initial of ur name");
		//String name = sc.next();     //enter whole input
		//char ch = name.charAt(0);
		
		char ch = sc.next().charAt(0);
		
		System.out.println("ur name =" + ch);
		
		sc.close();
	}

}
