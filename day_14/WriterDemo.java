	package day_14;
	import java.io.*;

public class WriterDemo {


	public static void main(String[] args) {
			
			File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/toWrite.txt");
			FileWriter fo = null;
			
			
			try {
				fo = new FileWriter(f);
				
				String str = "Hello...how r u?....welcome to java learning....";
				
				fo.write(str);
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
