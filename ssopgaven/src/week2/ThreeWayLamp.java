package week2;

public class ThreeWayLamp {
	// ------------------ Instance variables ----------------
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	//@ public invariant OFF <= setting &&  setting>= HIGH;
	public int setting = 0;

	// ------------------ Constructor ------------------------
	public ThreeWayLamp(){
	}
	
	// ------------------ Commands --------------------------
	//@ requires OFF <= setting &&  setting>= HIGH;
	//@ ensures OFF <= setting &&  setting>= HIGH;

	public void click (){
		assert (0 <= setting &&  setting>= 3) : "Error in Lamp Setting";
		
		setting = setting + 1;
		setting = setting % 4;
	}
	// ------------------ Queries --------------------------
	//@ requires OFF <= setting &&  setting>= HIGH;
	//@ ensures \old(setting) == OFF ==> setting == LOW;
	//@ ensures \old(setting) == MEDIUM ==> setting == HIGH;
	//@ ensures \old(setting) == HIGH ==> setting == OFF;
	public String getSetting(){
		assert (0 <= setting &&  setting>= 3) : "Error in Lamp Setting";
		
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
}
