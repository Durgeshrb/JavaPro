
public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=100;
		System.out.println("i = " + i);   // + is used to concatenate string
		
		
		/*if(5)
		{
			
		}*/
		
		
		double d = 4.5;
		d = i;  //implicit type casting
		
		i = (int)d; //explicit type casting
		
		byte b = 5;
		//b = b * 2;  -ERROR
		b = (byte)(b*2);  //right method
		
		
		
		
	}

}
