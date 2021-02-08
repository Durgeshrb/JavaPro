package day_6;





 abstract class Box1{                          //parent class
	int side_1,side_2;
	
	
	Box1(int side_1,int side_2){
		this.side_1 = side_1;
		this.side_2 = side_2;
	}
	
	void display()
	{
		System.out.println("side1 =" + side_1 +" side 2 = " + side_2);
	}
	
abstract void calArea();

}

class RectSqBox extends Box1{                        //child class for rectangular and square box
	RectSqBox(int side_1,int side_2){
		super(side_1,side_2);
	
		
	}
	
	RectSqBox(int side_1){
		super(side_1,side_1);
	
		
	}
	
	 void calArea()                      //for area of square
	{
		double area;
		area = side_1 * side_2;
		System.out.println("are of square or rectangle = " + area);
	
	}
	
	
		
	
	
	
}

class TriBox extends Box1{                              //child class for triangular box
	
	TriBox(int side_1,int side_2){
		super(side_1,side_2);
	
		
	}
		void calArea()
		{
			double tarea;
			tarea =side_1 * side_2 * 0.5;
			System.out.println("area of traingle is " + tarea);
		}
}


class ForShipment{
	void getArea(Box1 x)
	{
		x.calArea();
	}
	void getDisplay(Box1 x)
	{
		x.display();
	}
}


public class BoxWithAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForShipment sh = new ForShipment();
		RectSqBox r =new RectSqBox(10,20);
		RectSqBox r1 =new RectSqBox(10);
		TriBox t = new TriBox(10,20);
		
		sh.getArea(r);
		sh.getArea(r1);
		sh.getArea(t);
		
		sh.getDisplay(r);
		sh.getDisplay(r1);
		sh.getDisplay(t);
		

	}

}
