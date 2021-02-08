package day_13;

import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 LinkedList<String> list=new LinkedList<String>();
		 
		 //adding element
		 list.add("second");
		 list.add("third");
		 
		 //adding with addFirst
		 list.addFirst("First");
		 
		 //adding with addlast
		 list.addLast("fifth");
		 
		 
		 //adding with index
		 list.add(3, "Fourth");
		 
		 
		 //using iterator to traverse
		 
		 Iterator<String> it=list.iterator();
	     while(it.hasNext()){
	       System.out.println(it.next());
	     }
	     
	     
	     //remove with index
	     list.remove(4);
	     
	     //decending iterator
//	     list.descendingIterator();
	     
	     System.out.println("ListIterator with hasnext");
	     ListIterator<String> lit = list.listIterator();
	     while(lit.hasNext()){
	       System.out.println(lit.next());	     }
	     
	     System.out.println("List Iterator with hasPrvoius");
	     while(lit.hasPrevious()){
		       System.out.println(lit.previous());
	     }
		
	}

}
