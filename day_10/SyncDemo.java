package day_10;

class Xyz{
//	synchronized void call(String msg)     //instead of this we have used synchronized(x) inside run()
	 void call(String msg)
	{
	
		System.out.print("["+ msg);
		try {
		Thread.sleep(1500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}


class ThDemo implements Runnable{


	Thread t;
	Xyz x;
	String msg;
	
	ThDemo(String name,Xyz x,String msg)
	{
		this.x =x;
		this.msg =msg;
		t= new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		x.call(msg);          //syntax of synchronized void call(String msg)
		synchronized (x) {
			x.call(msg);
		}
		
		
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Xyz x = new Xyz();
		ThDemo d1 = new ThDemo("first",x,"Hi");
		ThDemo d2 = new ThDemo("Second",x,"Hello");
		ThDemo d3 = new ThDemo("Third",x,"How are you");
		
	}

}
