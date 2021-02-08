package day_4;


class operations{
	static void add(int i,int j) {
		int k = i + j;
		System.out.println(" result = "+ k);
	}
	 void add(int i,int j,int l) {
		int k = i + j + l;
		System.out.println(" result = "+ k);
	}
	static void add(int i,double j) {
		double k = i + j;
		System.out.println(" result = "+ k);
	}
}


public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operations ad = new operations();
		operations.add(10,20);   //using static
		ad.add(10,20,30);  //using object
		operations.add(10,20.5);  //calling using static

	}

}
