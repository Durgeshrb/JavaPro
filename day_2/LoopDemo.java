
public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		System.out.println("from while");
		while(i<=5)
		{
			System.out.println("i = "+ i);
			i++;
		}
		
		System.out.println("do while ");
		i=1;
		do{
			System.out.println("i = "+ i);
			i++;
		}while(i<=5);
		
		System.out.println("for loop");
		for(i = 1;i<=5;i++)
		{
			System.out.println("i = "+ i);
		}
		
		System.out.println("for loop variation with break");
		i=1;
		for(;;)
		{
			System.out.println("i = "+ i);
			i++;
			if(i>5)
				break;
		}
		
		
		System.out.println("for loop with continue");
		for(i = 1;i<=5;i++)
		{	if(i == 3)
				continue;
				
			System.out.println("i = "+ i);
		}
		
	}

}
