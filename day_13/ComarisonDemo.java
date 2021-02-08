package day_13;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee{
	int empId;
	String name;
	int age;
	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emloyee [empId="+empId+" name="+name+"age="+age+"]";	}
	
	
}

class AgeCom implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
		int  i =0;
		if(o1.age > o2.age)
			i=1;
		else if(o1.age < o2.age)
			i=-1;
		else if(o1.age == o2.age)
			i = 0;
		return i;
		
	}
}

class Idcom implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
		int  i =0;
		if(o1.empId > o2.empId)
			i=1;
		else if(o1.empId < o2.empId)
			i=-1;
		else if(o1.empId == o2.empId)
			i = 0;
		return i;
		
	}
}


class NameCom implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
		return o1.name.compareTo(o2.name);
	}
}


public class ComarisonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		TreeSet<Employee> ts = new TreeSet<>(new Idcom());
		ts.add(new Employee(1,"Mita",70));
		ts.add(new Employee(2,"Nita",80));
		ts.add(new Employee(3,"Sita",90));
		ts.add(new Employee(4,"Rita",75));
		
		
		Iterator<Employee> i = ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
