package day_3;

class rectangular_box
{
	int length,breadth;
	static int counter;
	
	rectangular_box(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		counter++;
	}
	
	
	rectangular_box(int length) {          //area of square
		this.length = length;
		this.breadth = length;
		counter++;
	}
	
	
	double area()
	{
		double result;
		result =this.length * this.breadth;
		
		return result;
	}
	
	
	static {
		counter = 0;
	}
}



public class SheepmentProject {
	public static void main(String[] args) {
	
	rectangular_box ar = new rectangular_box(20,30);
	System.out.println(ar.area());
	
	
	rectangular_box ar_sq = new rectangular_box(10);
	System.out.println(ar_sq.area());
	
	System.out.println("count of the boxes is "+ rectangular_box.counter);
	
	
	}
}
