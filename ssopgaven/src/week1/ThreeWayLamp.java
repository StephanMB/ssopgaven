package week1;

public class ThreeWayLamp {
	// ------------------ Instance variables ----------------
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	public int setting = 0;

	// ------------------ Constructor ------------------------
	public ThreeWayLamp(){

	}
	// ------------------ Commands --------------------------
	public void click (){

		setting = setting + 1;
		setting = setting % 4;
	}
	// ------------------ Queries --------------------------
	public String getSetting(){
		if (setting == OFF){
			return "Off";
		} else if (setting == LOW){
			return "Low";
		} else if (setting == MEDIUM){
			return "Medium";
		} else {
			return "High";
		}
	}
	
	public static void main (String[] args){
	}
}
