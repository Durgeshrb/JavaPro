package day_10;

class ImplThDemo implements Runnable{
	
	Thread t;
	public ImplThDemo(String name)
	{
		t = new Thread(this,name);
//		t.start();
		t.run();
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



public class RunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("entered main");

		ImplThDemo th = new ImplThDemo("NewTh");
		
		System.out.println(th.t.isAlive());
		
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

