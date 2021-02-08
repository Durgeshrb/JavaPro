
package day_13;
//student with comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



class Student11 implements Comparator<Student1>{
	private int rollno;
	private String name;
	
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Student11(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno="+rollno+" name="+name+"]";
	}

	public int comparator(Student11 o1,Student11 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	@Override
	public int compare(Student1 arg0, Student1 arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
public class StudentComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student1> a1 =new ArrayList<>();
		a1.add(new Student1(11, "Dheeraj"));
		a1.add(new Student1(2, "Abhijeet"));
		a1.add(new Student1(33, "Akash"));
		a1.add(new Student1(4, "Nitin"));
		a1.add(new Student1(5, "Sunder"));
		
		System.out.println("Student data before sorting");
		Iterator<Student1> i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		System.out.println("data after sorting ");
		Collections.sort(a1);
		System.out.println(a1);
		i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}


	}

}
