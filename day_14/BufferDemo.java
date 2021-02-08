package day_14;
import java.io.*;

public class BufferDemo {




	public static void main(String[] args) {
			
			File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/src/day_14/NewStringDemo");
			FileInputStream f1 = null;
			BufferedInputStream fi = null;
			
			
			try {
				f1 = new FileInputStream(f);
				fi = new BufferedInputStream(f1);
				
				int i;
				
				
				
				while ((i=fi.read())!=-1)
					System.out.println((char)i);
				
				
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
					f1.close();
					fi.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
		}

	}
