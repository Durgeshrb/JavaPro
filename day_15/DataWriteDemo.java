package day_15;
import java.io.*;

public class DataWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/toWrite.txt");
		FileOutputStream fo=null;
		DataOutputStream d=null;
		
		try {
			fo = new FileOutputStream(f);
			d = new DataOutputStream(fo);
			
			d.writeDouble(34.5);
			d.writeInt(24);
			d.writeChar('H');
			System.out.println("done!!!");
			
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		finally
		{
			
			try {
				fo.close();
				d.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}

}
