package week2;

public class ThreeWayLamp2 {
	// ------------------ Instance variables ----------------
	public enum State {OFF, LOW, MEDIUM, HIGH};
	public State setting;

	// ------------------ Constructor ------------------------
	public ThreeWayLamp2(){
		setting = State.OFF;
	}
	
	// ------------------ Commands --------------------------

	/**
	 * This method takes the integer representation of an enum state of the lamp using ordinal() and increases is by 1.
	 * After a value of 4 it is set back to 0.
	 */
	public void click (){
		int intRepresentation = setting.ordinal();
		intRepresentation = intRepresentation + 1;
		intRepresentation = intRepresentation % 4;
		setting = State.values()[intRepresentation];
	}
	// ------------------ Queries --------------------------
	//@ ensures \old(setting) == OFF ==> setting == LOW;
	//@ ensures \old(setting) == MEDIUM ==> setting == HIGH;
	//@ ensures \old(setting) == HIGH ==> setting == OFF;
	public String getSetting(){

		if (setting == State.OFF){
			return "Off";
		} else if (setting == State.LOW){
			return "Low";
		} else if (setting == State.MEDIUM){
			return "Medium";
		} else {
			return "High";
		}
	}
}
