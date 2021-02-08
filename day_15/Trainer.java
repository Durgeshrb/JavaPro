package day_15;
import java.io.Serializable;
public class Trainer implements Serializable{
	private int trid;  //transient int trid;
	private String trname;
	private int expYears;   //static private int expYears;
	public Trainer(int trid, String trname, int expYears) {
		super();
		this.trid = trid;
		this.trname = trname;
		this.expYears = expYears;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Trainer [tride = " + trid + ", trnname="+trname +",expYears="+expYears + "]";
	}
	
	
}




