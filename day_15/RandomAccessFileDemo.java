package day_15;
import java.io.*;
public class RandomAccessFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/towrite1.txt");
		RandomAccessFile raf =null;
		try {
			raf = new RandomAccessFile(f, "r");
			System.out.println((char)raf.read());
			raf.seek(12);
			System.out.println((char)raf.read());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
