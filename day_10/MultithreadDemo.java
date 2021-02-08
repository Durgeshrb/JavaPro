package day_10;



class ExtendsTh1 extends Thread{
	
	Thread t;
	public ExtendsTh1(String name)
	{
		super(name);
//		setDaemon(true);
		start();
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName() + " i= "+i);
				Thread.sleep(800);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
}



public class MultithreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("entered main");

		ExtendsTh1 th1 = new ExtendsTh1("first");
		ExtendsTh1 th2 = new ExtendsTh1("second");
		ExtendsTh1 th3 = new ExtendsTh1("third");
		System.out.println("Open door");
		System.out.println("is alive for first =" + th1.isAlive());
		
		
		
		try {
			th1.join();
			System.out.println("is alive for first =" + th1.isAlive());
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}
}


