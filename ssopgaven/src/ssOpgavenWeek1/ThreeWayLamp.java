package ssOpgavenWeek1;

public class ThreeWayLamp {
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	public int setting = 0;

	
	public ThreeWayLamp(){
	}
	
	public void click (){
		setting = setting + 1;
		setting = setting % 4;
	}

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
		ThreeWayLamp lamp = new ThreeWayLamp();
		System.out.println("Should be Off:");
		System.out.println(lamp.getSetting());
		System.out.println("Click! \n Should now be low:");
		lamp.click();
		System.out.println(lamp.getSetting());
		System.out.println("Click! \n Should now be medium:");
		lamp.click();
		System.out.println(lamp.getSetting());
		System.out.println("Click! \n Should now be high:");
		lamp.click();
		System.out.println(lamp.getSetting());
		System.out.println("Click! \n Should now be off:");
	}
}
