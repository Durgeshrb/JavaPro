package day_3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = 100 + i;
			System.out.println("i=" + arr[i]);
		}
		
		double iniArr[] = {112,13,14,15,6};
		for(int i=0;i<iniArr.length;i++) {
			System.out.println("iniArr " + iniArr[i] );
		}
		
		System.out.println(" for each loop");
		for(double var:iniArr){
			System.out.println(var);
		}

	}

}
