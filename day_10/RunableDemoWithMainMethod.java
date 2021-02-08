package day_10;

class ImplTh implements Runnable{
	
	
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



public class RunableDemoWithMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("entered amin");

		ImplTh th = new ImplTh();
		Thread t = new Thread(th,"NewTh");
		t.start();
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

