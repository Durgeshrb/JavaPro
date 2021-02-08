package day_12;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> a1 =new TreeSet<>();               //treeset -sorting as well as discarding same elements
		a1.add(123);
		a1.add(343);
		a1.add(646);
		a1.add(13);
		a1.add(343);
		
		Iterator<Integer> i = a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("headset till 343");
		i = a1.headSet(343,true).iterator();    //true- if you want 343  and false- if don't want 343
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		//HashSet
		HashSet<String> hs = new HashSet<>();
		hs.add("java");
		hs.add("Oracle");
		hs.add("Hibernate");
		hs.add("Spting");
		
		Iterator<String> i1 = hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

