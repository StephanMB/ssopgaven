package week1;

public class DollarsAndCentsCounter {
	// ------------------ Instance variables ----------------
	public int dollars = 0;	//this.dollars()>= 0
	public int cents = 0; //<+this.cents() && this.cents () <=99

	// ------------------ Constructor ------------------------
	public DollarsAndCentsCounter(){
		}
	// ------------------ Commands --------------------------
	public void add (int dollarsAdd, int centsAdd){
		dollars = dollars + dollarsAdd;	
		cents = cents + centsAdd;
		int dollarCents = cents / 100;		
		int rest = cents % 100;
		dollars = dollars + dollarCents;
		cents = rest;
	}
	
	//this.dollars == 0 && this.cents ==0
	public void reset (){
		dollars = 0;
		cents = 0;
	}
	// ------------------ Queries --------------------------
	
	public int dollars (){
		return dollars;
	}
	
	public int cents (){
		return cents;
	}
	
}
