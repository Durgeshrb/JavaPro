package day_4;


class DemoStatic{
	
	int i;
	static int j;
	
	
	void nonStat()
	{
		
	}
	
	static void statMethod()
	{
		 j=1;
		 //i=2;
		 DemoStatic a =new DemoStatic();
		 a.i=2;
	}
	
	
	static {
		System.out.println("in static block");
		//system.out.println(this);
		j=2;
		//i=1;
		statMethod();
		//nonStat();
	}
	
	static {
		System.out.println("In other static block");
	}
}




public class StaticDemo {
	
	static void method1()
	{
		System.out.println("In method one");
	}

	static {
		System.out.println("in static block of StaticDemo");
		//System.exit(0);        //use to do not execute main method.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s = new StaticDemo();
		s.method1();
		
		System.out.println("before class loading");
		DemoStatic.statMethod();
		System.out.println("after class loading");
		
		DemoStatic.j=100;
//		DemoStatic.i=100;
		
		DemoStatic d = new DemoStatic();
		System.out.println("j usig obj ="+d.j);
		System.out.println("j usig class ="+DemoStatic.j);
		DemoStatic d1 = new DemoStatic();
		System.out.println("j using obj"+d1.j);
		
		d1.j =200;
		d1.i=100;
		System.out.println("j usig obj ="+d.j);
		System.out.println("j usig class ="+DemoStatic.j);
		
		

	}

}
