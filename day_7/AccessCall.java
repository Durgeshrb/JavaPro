package day_7;

//or u can imort day_8.*;

public class AccessCall extends day_8.AccessDemo{
	
	void method1() {
		call();
	}

	
}

class ChildDiffClassDiffPak extends AccessCall {
	
	void method1()
	{
		call();
	}
}

class NonChildClassDiffPack{
	
	void method1()
	{
		day_8.AccessDemo d = new day_8.AccessDemo();
		d.call();
	}
}
