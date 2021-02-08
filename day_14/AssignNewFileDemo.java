package day_14;
import java.io.*;
import java.util.Scanner;
public class AssignNewFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name to create file");
		String fName= sc.next();
		File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/" + fName+".txt");
		System.out.println("congratulations!!!your file "+ fName+".txt is created");
		FileWriter fw = null;
		FileReader fi = null;
		
		int choice;
		String txt = "";
		
		try {
			fw = new FileWriter(f);
			fi =new FileReader(f);
			
			do {
				System.out.println("\nenter\n1:Write into file\n2.Stop writing and close file\n3.Read file\n4.Stop");
				choice = sc.nextInt();
				if(choice == 1)
				{
					System.out.println("write text to enter into file");
					sc.nextLine();
					txt = sc.nextLine() + "\n";
					
					fw.write(txt);
					System.out.println("Done");
					
				}
				
				else if(choice == 2)
				{
					fw.close();
					
				}
				
				else if(choice == 3)
				{
					
					int i ;
					while((i =fi.read())!=-1)
						System.out.print((char)i);
				}
				else if(choice == 4)
				{
					break;
				}
				
//				else if(choice == 5)
//				{
//					f.delete();
//				}
				else
				{
					System.out.println("plz select valid option...");
				}
				
				
			}while(true);
			
				
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
				fw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
