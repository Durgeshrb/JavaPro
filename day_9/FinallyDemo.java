package day_9;

public class FinallyDemo {
	
	void method1()
	{
		try {
			System.out.println("in try of method1");
			int i = 120;
			if(i>100)
				throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println("in catch of method1");
			
		}
			finally {
				System.out.println("in finally of method1");
			}
		
	}
	
	void method2() 
	{
		try {
			System.out.println("in try of method2");
			int i = 120;
			
		}catch(ArithmeticException e){
			System.out.println("in catch of method2");
			
		}
			finally {
				System.out.println("in finally of method2");
			}
	}
	
	void method3()
	{
		try {
			System.out.println("in try method3");
			return;
		}catch(ArithmeticException e){
			System.out.println("in catch of method3");
			
		}
			finally {
				System.out.println("in finally of method3");
			}
	}

	void method4()
	{
		try {
			System.out.println("in try method4");
			int i = 120;
			if(i>100)
				throw new ArithmeticException();
		}
		finally {
				System.out.println("in finally of method4");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FinallyDemo f = new FinallyDemo();
		f.method1();
		f.method2();
		f.method3();
		f.method4();
		
	}

}
