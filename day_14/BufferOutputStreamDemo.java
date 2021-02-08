package day_14;
import java.io.*;
public class BufferOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/towrite1.txt");
		
		FileOutputStream f0 = null;
		BufferedOutputStream fi = null;
//		System.out.println("enter name");
		
		
		try {
			f0 = new FileOutputStream(f,true);
			fi = new BufferedOutputStream(f0);
			
			String str = "Hello...how r u?....welcome!!!!   \nwriting ......";
			
			fi.write(str.getBytes());
			System.out.println("done!!!!");
			
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
				
				fi.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
		
		

	}

}
