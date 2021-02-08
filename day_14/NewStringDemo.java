package day_14;

public class NewStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		str.concat(" How r u?");
		System.out.println("before assignment str ="+str);
		
		str = str.concat(" how r u?");
		System.out.println("after assignment str ="+str);

		
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" how r u?");
		System.out.println("stingBuffer ="+sb);
		
		
		
		String str1 = "hello";
		String str2 = new String ("hello");
		
		String str3 ="hello";
		String str4 = new String("hello");
		
		if(str1 == str3)
		{
			System.out.println("same");
		}else
		{
			System.out.println("not same");
		}
		
		if(str2 == str4)
		{
			System.out.println("same");
		}else
		{
			System.out.println("not same");
		}
	}

}
