package week1;

public class Pay {
	
	public static final int WORKWEEK =40;

	public Pay(){
	}
	
	public double calculatePay (double rate, int hours){
		int overtime = hours - WORKWEEK;
			return hours * rate + 2*rate*overtime;
	}
	
	public static void main (String[] args){
		Pay pay = new Pay();
		System.out.println(pay.calculatePay(1, 50));
	}
}
