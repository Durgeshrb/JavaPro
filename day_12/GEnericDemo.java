package day_12;

class Demo<T extends Number>{
	T i;
	public T getI()
	{
		return i;
	}
	public void setI(T i)
	{
		this.i = i;
	}
	
	public Demo(T i)
	{
		super();
		this.i = i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Demo [i = " + i + "]";
	}
	
	
}

public class GEnericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<Integer>d = new Demo<>(100);
		System.out.println(d);
		System.out.println("i="+d.getI());

		Demo<Double>d1 = new Demo<>(155.5);
		
		System.out.println(d1);
		System.out.println("i="+d1.getI());
	}

}
