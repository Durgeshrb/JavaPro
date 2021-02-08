package day_6;


class Box{
	int side1;
	int side2;
	
	Box(int side1,int side2)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		
	}

	
	public String toString() {
		String str =" side 1 ="+side1+" side 2="+side2;
		return str;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	boolean isEqual(Box b1,Box b2)
	{
		boolean flag = false;
		
		if(b1.side1 == b2.side1  && b1.side2 == b2.side2)
			flag = true;
		else
			flag = false;
		return flag;
		
			
	}
	
	Box add(int i)             //if no object in parameter u can use return type Box...
	{
		this.side1 =this.side1 + i;
		this.side2 = this.side2 + i;
		return this;
	}

	
}

public class ObjParaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box(10,20);
		Box b2 =new Box(10,30);
		
		System.out.println(b);
		System.out.println(b2);
		
		if(b.isEqual(b,b2))
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println("before adding");
		b.add(10);
		System.out.println(b);
		System.out.println("after adding");

	}
	
	
}



