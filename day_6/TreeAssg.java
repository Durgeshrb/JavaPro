//package day_6;
//abstract  class Tree{
//	int TreeCode;
//	int TreeHeight;
//	int BaseWidth;
//	int time;
//	
//	Tree(int TreeCode,int TreeHeight,int BaseWidth,int time)
//	{
//		this.TreeCode = TreeCode;
//		this.TreeHeight = TreeHeight;
//		this.BaseWidth = BaseWidth;
//		this.time = time;
//	}
//	
// abstract void DisplayTree();
// 
//
// }
//class CocTree extends Tree{
//	int NoCoc;
//	CocTree(int TreeCode,int TreeHeight,int BaseWidth,int time,int NoCoc){
//	super(TreeCode,TreeHeight,BaseWidth,time);
//	this.NoCoc = NoCoc;
//	
//	}
//	 void Displaytree()
//	{	
//		System.out.println("Coconut Tree");
//		System.out.println("TreeCode =" +TreeCode );
//		System.out.println("Tree Height =" +TreeHeight );
//		System.out.println("BaseWidth =" +BaseWidth );
//		System.out.println("time spent on tree(in hours) daily is " + time);
//		System.out.println("No of Fruits on tree = " + NoCoc);
//		
//	}
//	void annualUpdate(int th,int bw,int t)
//	{
//		TreeHeight = TreeHeight + th;
//		BaseWidth = BaseWidth + bw;
////		int time;
//		time = time + t;
//		
//		
//		
//	}
//	
//	
//	
//}
//
//class MangoTree extends Tree{
//	int NoMango =0;
//	MangoTree(int TreeCode,int TreeHeight,int BaseWidth,int time,int NoMango )
//	{
//		super(TreeCode,TreeHeight,BaseWidth,time);
//		this.NoMango = NoMango;
//		
//		
//	}
//	
//	void  addMangoCount(int count)
//	{
//		NoMango = NoMango + count;
//		
//	}
//	
//	void getFrCount()
//	{
//		System.out.println("total fruit to a tree are " + NoMango);
//	}
//	
//	
//	void Displaytree()
//	{	System.out.println("Mango tree");
//		System.out.println("TreeCode =" +TreeCode );
//		System.out.println("Tree Height =" +TreeHeight );
//		System.out.println("BaseWidth =" +BaseWidth );
//		System.out.println("time spent on tree(in hours) daily is " + time);
//		System.out.println("Total no of mangoes on tree " + NoMango);
//	}
//	
//}
//
//
//class TreeDetails{
//	void getUpdates(Tree t)
//	{
//	//	t.annualUpdate();
//	}
//	void getFruitCount(MangoTree t)
//	{
//		t.getFrCount();
//	}
//	void TDetails(Tree t)
//	{
//		t.DisplayTree();
//	}
//}
//
//
//
//public class TreeAssg {
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TreeDetails td = new TreeDetails();
//		
//		
//		CocTree ct = new CocTree(1001,20,1,50,15);
//		MangoTree mt = new Tree();
//		
//		td.getFruitCount(mt);
//		td.TDetails(ct);
//		td.TDetails(mt);
////		t.Displaytree();
////		t.annualUpdate(2, 1, 5);
////		t.Displaytree();
//		
//	}
//
//}
