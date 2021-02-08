
package Day_11;


class Pizza1{
	int count;
	boolean flag = false;
	
	synchronized void put(int i)
	{
		if(flag) {
			try {
		
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		count = i;
		System.out.println("produced pizza no " +i);
		notify();
		flag = true;
	}
	
	synchronized int consume()
	{
		
		if(!flag) {
			
			try {

			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println("consumed pizza no " +count );
		notify();
		flag =false;
		return count;
		
		
	
		
}
}



class Producer1 implements Runnable{
	Thread t;
	Pizza p;
	Producer1(String name,Pizza p)
	{
		this.p = p;
		t = new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
		for(int i = 1;i<=10;i++)
		{
			p.put(i);
		}
	}
}


class Consumer1 implements Runnable{
	Thread t;
	Pizza p;
	Consumer1(String name,Pizza p)
	{
		this.p = p;
		t = new Thread(this,name);
		t.start();
	}
	
	public void run()
	{
		for(int i =1;i<=10;i++)
		{
			p.consume();
		}
	}
}


public class InterThreadCommWithMain {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza p = new Pizza();
		Producer pr = new Producer("Producer",p);
		Consumer c = new Consumer("Consumer ",p);

	}

}


