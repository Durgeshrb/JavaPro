package day_15;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/toWrite.txt");
		FileInputStream fo=null;
		DataInputStream d=null;
		
		try {
			fo = new FileInputStream(f);
			d = new DataInputStream(fo);
			
			System.out.println(d.readDouble());
			System.out.println(d.readInt());
			System.out.println(d.readChar());
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
