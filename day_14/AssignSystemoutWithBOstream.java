package day_14;
import java.io.*;

	public class AssignSystemoutWithBOstream {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			byte b[] = new byte[20];
			BufferedOutputStream b1 = null;
			
			
			
			try {
				b1 =new BufferedOutputStream(System.out);
				String str = "You are writing using BufferedOutputStream with system.out";
				b1.write(str.getBytes());
				
//				System.out.println(new String(b));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				try {
					b1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
			
		}

	}
