import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter alphabet");
		
		char ch = sc.next().charAt(0);
		
		
		if ((ch== 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch =='u'))
		{
			System.out.println("its vowel");
			
		}else {
			System.out.println("its consonant");
		}
		
		sc.close();
	}

}
