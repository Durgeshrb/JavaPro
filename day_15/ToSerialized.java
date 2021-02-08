package day_15;
import java.io.*;
public class ToSerialized {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub

		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/ToSer.txt");
		FileOutputStream fo = null;
		ObjectOutputStream o = null;
		
		
		
		try {
			fo = new FileOutputStream(f);
			o = new ObjectOutputStream(fo);
			
			Trainer tr =new Trainer(1,"Priti",14);
			o.writeObject(tr);
			System.out.println("done");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
