package day_7;

interface VarInf{
	int  var = 100;
}


class VarImpl implements VarInf{
	void method1()
	{
		System.out.println("var = "+ var);
	}
}

public class VarInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("var = " + VarInf.var);

	}

}
