package day_7;

import java.util.*;

interface MediInf{
	void getDisplay();
	void displayLable();
}

abstract class Medicine implements MediInf{
	String name;
	int prize;
	String brand;
	public Medicine(String name, int prize, String brand) {
		super();
		this.name = name;
		this.prize = prize;
		this.brand = brand;
	}
	
	public void getDisplay()
	{
		System.out.println("name = " + name+ " prize = "+prize+ " brand = "+brand);
	}
}


class Tablet extends Medicine{

	public Tablet(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLable()
	{
		System.out.println("Keep in Cool place");
		
	}
}

class Syrup extends Medicine{

	public Syrup(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLable()
	{
		System.out.println("Shake before use");
		
	}
}

class Ointment extends Medicine{

	public Ointment(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLable()
	{
		System.out.println("For external use only");
		
	}
}


class ForMedicine{
	void forDetails(MediInf m)
	{
		m.getDisplay();
	}
	
	void forLabel(MediInf m)
	{
		m.displayLable();
	}
}


public class MedicineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ForMedicine f = new ForMedicine();
		Medicine m = null;
		char conti = 'y';
		
		do {
			System.out.println("Enter 1 for Tablet,2 for Syrup,3 for Ointment");
			int ch = sc.nextInt();
			String name = "";
			int prize;
			String brand = "";
			switch(ch)
			{
				case 1:
					System.out.println("Enter Name");
					name = sc.next();
					System.out.println("Enter prize");
					prize = sc.nextInt();
					System.out.println("Enter Brand Name");
					brand = sc.next();
					m = new Tablet(name,prize,brand);
					f.forDetails(m);
					f.forLabel(m);
					break;
					
				case 2:
					System.out.println("Enter Name");
					name = sc.next();
					System.out.println("Enter prize");
					prize = sc.nextInt();
					System.out.println("Enter Brand Name");
					brand = sc.next();
					m = new Syrup(name,prize,brand);
					f.forDetails(m);
					f.forLabel(m);
					break;
					
				case 3:
					System.out.println("Enter Name");
					name = sc.next();
					System.out.println("Enter prize");
					prize = sc.nextInt();
					System.out.println("Enter Brand Name");
					brand = sc.next();
					m = new Ointment(name,prize,brand);
					f.forDetails(m);
					f.forLabel(m);
					break;
					
				default:
					System.out.println("Wrong choice");
					
					
					
					
			}
			
			System.out.println("Do you want to continue(y/n)");
			conti = sc.next().charAt(0);
			}while(conti == 'y');
		
		sc.close();
	}

}
