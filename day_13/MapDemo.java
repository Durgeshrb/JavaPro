package day_13;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(11,"Pune");
		tm.put(21,"Nagpur");
		tm.put(31, "Delhi");
		tm.put(9, "Mumbai");
		
		Iterator<Integer> i = tm.keySet().iterator();
		while(i.hasNext())
		{
			Integer key = i.next();
			String val = tm.get(key);
			System.out.println("key =" +key+ " val "+val);
		}
		
		
		//hashmap
		System.out.println("hashMap");
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(11,"Pune");
		hm.put(21,"Nagpur");
		hm.put(31, "Delhi");
		hm.put(9, "Mumbai");
		
		i = hm.keySet().iterator();
		while(i.hasNext())
		{
			Integer key = i.next();
			String val = hm.get(key);
			System.out.println("key =" +key+ " val "+val);
		}
		
//		System.out.println("value iterator");
//		Iterator<String> i1 = hm.values().iterator();
		
		
		
		//LinkedHashMap
		
		
		
		
	}

}
