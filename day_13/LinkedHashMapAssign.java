package day_13;
import java.util.*;
public class LinkedHashMapAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
		  
		  lhm.put(1,"Akash");  
		  lhm.put(3,"akshay");  
		  lhm.put(2,"arnav");  
		  
		for(Map.Entry m:lhm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
	}

}
