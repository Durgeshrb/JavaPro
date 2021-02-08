package day_8;

//pojo
class Student
{
	int rollno;
	int marks;
	String name;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	public Student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	
	
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student(1,75,"Dheeraj");
		System.out.println(st);
		
		System.out.println("marks = "+st.getMarks()+ " name = "+st.getName() );
		st.setMarks(98);
		System.out.println("marks = "+st.getMarks()+ " name = "+st.getName()+ " roll no "+ st.getRollno() );
		
	}

}
