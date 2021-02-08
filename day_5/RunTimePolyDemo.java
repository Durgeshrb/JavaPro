package day_5;






class PClass{
	
	void method1()
	{
		System.out.println("in method1 of PClass");
	}
	
}

class ChClass extends PClass{
	
	void method1()
	{
		System.out.println("in method1 of ChClss");
	}
	
	
	void method2(){
		System.out.println("in method2 of Child class");
	}
}

class GCClass extends ChClass{
	void method1()
	{
		System.out.println("in method1 of GCClss");
	}
}



public class RunTimePolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PClass p = new PClass();
		ChClass c = new ChClass();
		GCClass g = new GCClass();
		
		p.method1();
		p=c;
		p.method1();
//		p.method2();
		
		p=g;
		p.method1();
		
	}

}
