import java.util.Scanner;

public class SeasonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);    
		System.out.println("enter a month number");
		int month = sc.nextInt();
		
		switch(month)
		{
		
		case 5:
		case 2:
		case 3:
		case 4:
			System.out.println("its summer season");
			break;
		
		case 9:
		case 6:
		case 7:
		case 8:
			System.out.println("its rainy season");
			break;
		
		case 1:
		case 10:
		case 11:
		case 12:
			System.out.println("its winter season");
			break;
		}
		
		sc.close();
	}

}

