package day_6;

public class FinalDemo {
	
	int i;
	final int j=1;
	final int z;
	static final int k;
	
	static {
		k=4;
	}
	
	FinalDemo(int x)
	{
		z=x;             //initializing final variable inside constructor
	}
	
	void method1(final int paravar)
	{
	
//		z=2;          //final data variable can not be assigned
		int a=paravar;
		final int localvar;
		localvar = 3;
	}
	
	final void FinalMethod()        					//final method
	{                                                      
		System.out.println("in final method");
	}

	

	

}





