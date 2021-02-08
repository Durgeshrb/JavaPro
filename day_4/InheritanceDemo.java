package day_4;


class ParentCl{
	
	int i;
	
}

class ChildCl extends ParentCl{
	int j;
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildCl ch = new ChildCl();
		ch.i=10;
		ch.j=20;
		
		System.out.println("i = "+ch.i + " j = "+ ch.j);
	}

}
