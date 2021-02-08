package day_6;
class Tree{
	int TreeCode;
	int TreeHeight;
	int BaseWidth;
	int time;
	Tree(int TreeCode,int TreeHeight,int BaseWidth,int time)
	{
		this.TreeCode = TreeCode;
		this.TreeHeight = TreeHeight;
		this.BaseWidth = BaseWidth;
		this.time = time;
	}
	
	 void Displaytree()
	{	
		System.out.println("Coconut Tree");
		System.out.println("TreeCode =" +TreeCode );
		System.out.println("Tree Height =" +TreeHeight );
		System.out.println("BaseWidth =" +BaseWidth );
		System.out.println("time spent on tree(in hours) daily is " + time);
		
		
	}
	 
		void annualUpdate(int th,int bw,int t)
		{
			TreeHeight = TreeHeight + th;
			BaseWidth = BaseWidth + bw;
//			int time;
			time = time + t;
			
			
			
		}
		
		
}

class MangoTree extends Tree{
int NoMango =0;
MangoTree(int TreeCode,int TreeHeight,int BaseWidth,int time,int NoMango )
{
	super(TreeCode,TreeHeight,BaseWidth,time);
	this.NoMango = NoMango;
	
	
}

void  addMangoCount(int count)
{
	NoMango = NoMango + count;
	
}

void Displaytree()
{	System.out.println("Mango tree");
	System.out.println("TreeCode =" +TreeCode );
	System.out.println("Tree Height =" +TreeHeight );
	System.out.println("BaseWidth =" +BaseWidth );
	System.out.println("time spent on tree(in hours) daily is " + time);
	System.out.println("Total no of mangoes on tree " + NoMango);
}

}

public class TreeAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree(1000,25,1,6);
		MangoTree mt = new MangoTree(1001,20,1,5,200);
		
		t.Displaytree();
		t.annualUpdate(2, 1, 1);
		t.Displaytree();
		
		mt.Displaytree();
		mt.addMangoCount(25);
		mt.Displaytree();
		

	}

}
