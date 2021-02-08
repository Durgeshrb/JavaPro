package day_3;


class JavaStudent{
	int rollno;
	int marks;
	
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

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaStudent jst = new JavaStudent();
		jst.setData(1, 75);
		jst.display();
	}

}
