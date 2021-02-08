package day_15;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ToDeSerializedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/ToSer.txt");
		FileInputStream fo = null;
		ObjectInputStream o = null;
		
		
		
		try {
			fo = new FileInputStream(f);
			o = new ObjectInputStream(fo);
			
			Trainer x;
			try {
				x = (Trainer) o.readObject();
				System.out.println("Obje="+x);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
