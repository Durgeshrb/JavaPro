package day_12;
import java.util.*;

public class LegacyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v = new Vector<>();
		
		v.add(100);
		v.add(130);
		v.add(150);
		v.add(230);
		v.add(2,200);
		
		for(Integer z :v)
		{
			System.out.println(z);
		}
		System.out.println("contains 150 "+v.contains(150));
		System.out.println("element at 4 "+ v.elementAt(3));
		
		Enumeration<Integer> e = v.elements();
		System.out.println("using enumeration..");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		Object arr[] = v.toArray();
		for(Object z : arr)
		{
			System.out.println((Integer)z);
		}

		
		//hash table
		System.out.println("in hash table");
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Mita");
		ht.put(2, "sita");
		ht.put(3, "gita");
		ht.put(4, "rita");
		
		Enumeration<Integer> e1 = ht.keys();
		while(e1.hasMoreElements())
		{
			Integer key = e1.nextElement();
			String val = ht.get(key);
			System.out.println("key =" + key + " val = "+val);
		}
		
		
		
		//replace(key,val);
		ht.replace(2, "Nita");
		System.out.println("hash table is empty ="+ht.isEmpty() );
		System.out.println("contains key 3"+ ht.containsKey(3));
		System.out.println("removed rita"+ ht.remove(4));
		
		
		System.out.println("enumerated elemtns");
		
		Enumeration<Integer> e2 = ht.keys();
		while(e1.hasMoreElements())
		{
			Integer key = e2.nextElement();
			String val = ht.get(key);
			System.out.println("key =" + key + " val = "+val);
		}
		
		
		
		
	}

}
