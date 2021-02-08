package day_14;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "abcde";
		String s2 = "abcde";
		String s3 = "s12345";
		String s4 = "12345";
		
		System.out.println("charAt-"+ s1.charAt(2));
		System.out.println("comareTo -"+s1.compareTo(s2));
		
		System.out.println(  s4=s4.concat(s3));
		System.out.println("contains c-" +s2.contains("c"));
		System.out.println("endswith e-" + s1.endsWith("e"));
		System.out.println("equalsIngnorecase-"+ s1.equalsIgnoreCase(s4));
		System.out.println("index of d-"+s1.indexOf("d"));
		System.out.println("isEmpty-"+s4.isEmpty());
		System.out.println("length()-"+s1.length());
		System.out.println("before replace-"+s1+" after replacing a with z"+s1.replace("a", "z"));
		System.out.println("touppercase-"+s2.toUpperCase());
		System.out.println("tolowercase"+s2.toLowerCase());
		System.out.println("substring abcde reurs with parameter 2-" + s1.substring(2));
		
		
		
		
		
		
	}
	
}
