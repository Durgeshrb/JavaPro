package day_5;

class ParentCl{
	int i;
	ParentCl(int i){
		this.i=i;
	}
	
	void display()
	{
		System.out.println("method from parent");
		
	}
	
}

class ChildCl extends ParentCl{
	int i;
	ChildCl(int a,int b)
	{
		super(a);
		i=b;
	}
	void display()
	{
		super.display();
		System.out.println("i form parent " + super.i);             //super is used to refer to member of parent class if same member name
		System.out.println("i form child " + i);
	}
}


public class SuperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildCl ch = new ChildCl(10,20);
		ch.display();
		
		
	}

}
