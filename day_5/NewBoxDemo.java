package day_5;

class Box{                          //parent class
	int side_1,side_2;
	
	
	Box(int side_1,int side_2){
		this.side_1 = side_1;
		this.side_2 = side_2;
	}
	
}

class RectBox extends Box{                        //child class for rectangular and square box
	RectBox(int side_1,int side_2){
		super(side_1,side_2);
		this.side_1 =side_1;
		this.side_2 =side_2;
		
	}
	void Sarea()                      //for area of square
	{
		double sarea;
		sarea = side_1 * side_1;
		System.out.println("are of square = " + sarea);
	
	}
	
	void Rarea()                       //for area of rectangle
	{
		double rarea;
		rarea = side_1 * side_2;
		System.out.println("are of rectangle = " + rarea);
	
	}
		
	
	
	
}

class TriBox extends Box{                              //child class for triangular box
	
	TriBox(int side_1,int side_2){
		super(side_1,side_2);
		this.side_1 = side_1;
		this.side_2 = side_2;
		
	}
		void area()
		{
			double tarea;
			tarea =side_1 * side_2 * 0.5;
			System.out.println("area of traingle is " + tarea);
		}
}



public class NewBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectBox r =new RectBox(10,20);
		TriBox t = new TriBox(10,20);
		
		r.Rarea();
		r.Sarea();
		t.area();

	}

}
