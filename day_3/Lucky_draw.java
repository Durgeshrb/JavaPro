package day_3;
import java.util.Scanner;


public class Lucky_draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			int u_num;			//user number
			int lucky_num[]= {5,15,9,11,19};   //predefined some lucky numbers
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Plz enter number of your choice");
			u_num = sc.nextInt();
			boolean flag = false;
			for(int i=0;i<lucky_num.length;i++) {
				if(u_num == lucky_num[i]) {
					flag = true;                //compared the numbers
					break;
				}
			
				
			}
			if(flag == true)					
				System.out.println("you win!!!");
			else
				System.out.println("you loss");
			sc.close();
	}

}
