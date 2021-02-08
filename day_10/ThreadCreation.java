package day_10;

class ExtendsTh extends Thread{
	
	public ExtendsTh (String name)
	{
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++)
		{
			try {
				System.out.println(getName() +" i= "+i);
				Thread.sleep(800);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
	
}



public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("entered amin");
//		Thread th = new Thread("NewTh");
//		th.start();  //it calls run()
		
		ExtendsTh th = new ExtendsTh("NewTh");
		th.start();
//		th.start();   //cant no restart the thread
		
		for(int i = 1;i<=5;i++)
		{try {
			
		System.out.println(Thread.currentThread().getName()+" i =" +i);
		Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}

	}
}

