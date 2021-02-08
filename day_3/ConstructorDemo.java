package day_3;





class JspmStudent{
	int rollno;
	int marks;
	
	JspmStudent()
	{
		System.out.println("parameter less constructor");
	}
	
	void setData(int r,int m)
	{
		rollno = r;
		marks = m;
	}
	
	void display()
	{
		System.out.println("rolln0 ="+rollno+" marks="+marks);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JspmStudent jst = new JspmStudent();
		jst.setData(1, 75);
		jst.display();
	}

}





