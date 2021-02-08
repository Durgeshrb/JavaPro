package day_8;

public class AccessDemo {

	

		
		public void call()
		{
			System.out.println("In call of Access Demo");
		}
	
		void xyz()
		{
			call();
		}

}


class DiffClassChildSamePack extends AccessDemo
{	
	
	void method1()
	{
		
		call();
	}
	
}


class DiffClassNonChildSamePack{
	
	void method1()
	{
		AccessDemo d = new AccessDemo();
		d.call();
	}
}