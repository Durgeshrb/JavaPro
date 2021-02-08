package day_13;
import java.util.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int marks;
	
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno="+rollno+" name="+name+"marks="+marks+"]";
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int  i =0;
		if(this.marks > o.marks)
			i=1;
		else if(this.marks < o.marks)
			i=-1;
		else if(this.marks == o.marks)
			i = 0;
		return i;
	}
	
}


public class UserDefinedObjInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TreeSet<Student> ts = new TreeSet();
		ts.add(new Student(1,"Mita",70));
		ts.add(new Student(2,"Nita",80));
		ts.add(new Student(3,"Sita",90));
		ts.add(new Student(4,"Rita",75));
		
		
		Iterator<Student> i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
