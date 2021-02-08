package day_3;





class JspmStudents{
	int rollno;
	int marks;
	
	JspmStudents()
	{
		System.out.println("parameter less constructor");
	}
	/*
	JspmStudents(int r,int m)      //parameterized constructor
	{
		System.out.println("Parameterised constructor");
		rollno = r;
		marks = m;
	}
/*	

/*	JspmStudents(int rollno,int marks)      //parameterized constructor with data variable..we got 0 as value as the data is hidden...
	{										//so we need to use this keyword to access values of data
		System.out.println("Parameterised constructor");
		rollno = rollno;
		marks = marks;
	}
	*/
	
		JspmStudents(int rollno,int marks)     
	{										// use this keyword to access values of data variable
		System.out.println("Parameterised constructor");
		this.rollno = rollno;
		this.marks = marks;
	}
	
	
	
	void display()
	{
		System.out.println("rolln0 ="+rollno+" marks="+marks);
	}
}

public class ParConstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JspmStudents jst = new JspmStudents(1,95);    //parameterized constructor called
		
		jst.display();
	}

}





