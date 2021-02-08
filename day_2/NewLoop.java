
public class NewLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("i = "+ i + " j =" + j);
			}
		}
		//print pattern 12345
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j + " ");      //avoid use of ln in println
			}
			System.out.println();
		}
		
		
		//print pattern 54321 5432 543 54 5
				for(int i =1;i<=5;i++) {
					for(int j=5;j>=i;j--) {
						System.out.print(j + " ");      //avoid use of ln in println
					}
					System.out.println();
				}
				
				
				//print pattern 12345 1234 123 12 1
				for(int i =5;i>=1;i--) {
					
					for(int j=1;j<=i;j++) {
						System.out.print(j + " ");      //avoid use of ln in println
					}
					System.out.println();
				}
				
				
				//HW-pattern 5 54 543 5432 54321
				for(int i=5;i>=1;i--) {
					for(int j = 5;j>=i;j--) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
				
		
	}
	
	
	
	

}
