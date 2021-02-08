package day_14;
import java.io.*;
public class InputFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/src/day_14/NewStringDemo.java");
		
		FileInputStream fi= null;                  //if not null then get error in try that fi is not initialized
		
		try {
			fi =new FileInputStream(f);
			int i ;
			while((i =fi.read())!=-1)
				System.out.print((char)i);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
