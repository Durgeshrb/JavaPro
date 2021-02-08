package day_12;
import java.util.*;


class Student
{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno"+rollno+" name"+name+"]";
	}
	
	
}


class RollCom implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int  i =0;
		if(o1.rollno > o2.rollno)
			i=1;
		else if(o1.rollno < o2.rollno)
			i=-1;
		else if(o1.rollno == o2.rollno)
			i = 0;
		return i;
		
	}
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubA
		System.out.println("arraylist");
		ArrayList<Integer> a1 =new ArrayList<>();
		a1.add(123);
		a1.add(343);
		a1.add(646);
		a1.add(13);
		
		System.out.println("3rd element ="+a1.get(2));
		Iterator<Integer> i = a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		//passing user defined object to arraylist
		
		ArrayList<Student> a2 =new ArrayList<>();
		a2.add(new Student(11, "aaaa"));
		a2.add(new Student(2, "bbbb"));
		a2.add(new Student(33, "cccc"));
		a2.add(new Student(4, "dddd"));
		
		
		Iterator<Student> i1 = a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		Collections.sort(a2,new RollCom());
		System.out.println("after sorting");
		i1=a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
