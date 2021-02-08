package day_3;

class Student{
	int rollno;
	int marks;
}




public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st;
		st = new Student();
		Student st1 = new Student();
		st.rollno = 1;
		st.marks = 75;
		System.out.println("id = "+ st.rollno +" marks = "+ st.marks);
		
		st1.rollno =2;
		st1.marks = 70;
		System.out.println("id ="+ st.rollno + "marks = "+ st.marks);
		System.out.println("id ="+ st1.rollno + "marks = "+ st1.marks);
		
		
		Student st2 =st1;
		st1 =null;
		System.out.println("id ="+ st2.rollno + "marks = "+ st2.marks);
	//	System.out.println("id ="+ st1.rollno + "marks = "+ st1.marks);  //give error as we made st1 = 0 explicitly
	}

}
