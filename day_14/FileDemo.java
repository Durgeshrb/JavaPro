package day_14;
import java.io.*;
import java.util.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	File f = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/src/day_14/NewStringDemo");	//use front '/' slash
		
	System.out.println("name = "+f.getName());
	
	System.out.println("is file ="+f.isFile());
	System.out.println("can read ="+ f.canRead());
	System.out.println("can write ="+ f.canWrite());
	System.out.println("exists"+ f.exists());
	System.out.println("is directory = "+ f.isDirectory());
	System.out.println("is hidden ="+ f.isHidden());
	System.out.println("free space =" + f.getFreeSpace());
	System.out.println("length "+ f.length());
	System.out.println("last modified = " + f.lastModified());
	
	
	
	
	System.out.println("\n............\nnew direcotory");
	File f1 = new File("C:/Users/Durgesh/eclipse-workspace/NewProject/src/day_14");	//use front '/' slash
	
	System.out.println("name = "+f1.getName());
	
	System.out.println("is file ="+f1.isFile());
	System.out.println("can read ="+ f1.canRead());
	System.out.println("can write ="+ f1.canWrite());
	System.out.println("exists"+ f1.exists());
	System.out.println("is directory = "+ f1.isDirectory());
	System.out.println("is hidden ="+ f1.isHidden());
	System.out.println("free space =" + f1.getFreeSpace());
	System.out.println("length "+ f1.length());
	System.out.println("last modified = " + f1.lastModified());
	
	//to see all files present in given directory
	String arr[] = f1.list();
	for(String str : arr)
	{
		System.out.println(str);
	}


	}

}
