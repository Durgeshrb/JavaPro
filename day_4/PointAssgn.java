package day_4;


class Point{
	double x_cor,y_cor;
	
	{
		System.out.println("in instance block");
	}

	
	
	Point(int  x_cor,int y_cor)
	{
		this.x_cor = x_cor;
		this.y_cor = y_cor;
		
		System.out.println(" x and y cordinates are "+x_cor + " & "+y_cor);
		
		
	}
	Point(int  a)
	{
		x_cor =a;
		y_cor=x_cor;
		
		System.out.println(" x and y cordinates are "+x_cor + " & "+y_cor);
		
	}
	
	void add(int a, int b)
	{
		x_cor = x_cor+a;
		y_cor = y_cor+b;
		
		System.out.println(" x and y cordinates are "+x_cor + " & "+y_cor);
	}
	
	
	void add(int a)
	{
		x_cor = x_cor+a;
		
		y_cor = y_cor + a;
		
		System.out.println(" x and y cordinates are "+x_cor + " & "+y_cor);
	}
}

public class PointAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(0,0);
		Point p1 = new Point(10,20);
		Point P2= new Point(10);
		p.add(10,20);
		p.add(10);

	}

}
