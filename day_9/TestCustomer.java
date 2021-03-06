package day_9;
import java.util.*;

class InvalidInputException extends Exception{
	
	
	

	public String getMessage() {
		// TODO Auto-generated method stub
		String str ="plz enter valid details";
		return str;
	}
}

class Customer{
	private String custNo;
	private String custName;
	private String catagory;
	String s1= "Platinum";
	String s2 = "Gold";
	String s3 = "Silver";

	
	public Customer(String custNo, String custName, String catagory) {
		super();
		String cn = custNo.toString();
//		System.out.println(cn.charAt(0));
		this.custNo = custNo;
		this.custName = custName;
		this.catagory = catagory;
		System.out.println(custNo.charAt(0));
		
		try {
			if(custName.length() <= 3   || cn.charAt(0) !='c')
			{
				throw new InvalidInputException();
			}
			
			if(s1.equals(catagory) || s2.equals(catagory) || s3.equals(catagory))
			{
				
			}
			else
			{
				throw new InvalidInputException();
			}
			
			
		}catch(InvalidInputException i ){
				
			System.out.println(i.getMessage());
			}
		
		
		
		
		
		
		}
	

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCatagory() {
		return catagory;
	}
	
	
	
}

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer number");
		String custNumber = sc.next();
		
		
		System.out.println("enter customer name");
		String custName = sc.next();
		
		System.out.println("enter customer catagory");
		String custCatagory = sc.next();
		
		
		Customer c = new Customer(custNumber,custName,custCatagory);
		System.out.println("customer Details are:");
		System.out.println(c.getCustNo());
		System.out.println(c.getCustName());
		System.out.println(c.getCatagory());
		
		sc.close();

	}

}
