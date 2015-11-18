package week1;

public class passed {
	
	public passed(){		
	}
	
	public boolean test( int score){
		return score>=70;
	}

	public static void main (String[] args){
		passed passed = new passed();
		System.out.println(passed.test(69));
		System.out.println(passed.test(70));
		System.out.println(passed.test(71));
	}
}
