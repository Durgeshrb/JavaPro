package day_14;
import java.io.*;
public class OutputDemoWithMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/toWrite.txt");
		FileOutputStream fo = null;
		
		
		try {
			fo = new FileOutputStream(f);
			
			String str = "hello...how r u? ....welcome to java learning..";
			
			fo.write(str.getBytes());
			System.out.println("Done!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				fo.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
