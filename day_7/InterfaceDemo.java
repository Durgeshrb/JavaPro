package day_7;


interface Inf1{
	void method1();
	
}

interface Inf2{
	void method2();
	
}

class PClass{
	void method3() {
		System.out.println("in method3 of Pclass ;");
	}
}


class ImplInf1 extends PClass implements Inf1,Inf2{
	public void method1()
	{
		System.out.println("in method1 of ImplInf1");
		
	}

	public void method2()
	{
		System.out.println("inmethod2 of IMplInf1");
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inf1 i =new Inf1();
		Inf1 i;
		Inf2 j;
		ImplInf1 x = new ImplInf1();
		
		i = x;
		i.method1();
		j=x;
		j.method2();
		

	}

}
