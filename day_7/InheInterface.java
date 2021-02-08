package day_7;

interface ParentInf{
	void method1();
	
}

interface SecInf{
	void method3();
}

interface ChildInf extends ParentInf,SecInf{
	void method2();
}

class ImplInh implements ChildInf{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("in method1 of ImplInh");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("in method2 of ImplInh");
		
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InheInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInf ch = new ImplInh();
		ch.method1();
		ch.method2();
		ch.method3();
	}

}
