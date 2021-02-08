package day_4;


class PClass{
	
	int i;
	PClass(){
		System.out.println("in constructor of P class");
	}
}

class ChClass extends PClass{
	int j;
	ChClass(){
		System.out.println("in constructor of Ch class");
	}
}

class GChClass extends ChClass{
	//grand child class
	int k;
	GChClass(){
		System.out.println("in constructor of G CH class");
	}
}
public class MultiLevelInhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GChClass g = new GChClass();
		g.i=1;
		g.j=2;
		g.k=3;
		System.out.println(" value of i = "+g.i +" j = " +g.j + " k = "+g.k);
		

				 
	}

}
