package week2;

public class ThreeWayLampTest {

	public ThreeWayLampTest(){
		
	}
	
	public void Test(ThreeWayLamp2 lamp){
	
		Boolean result1 = compare(lamp.getSetting(), "Off");
		System.out.println("Test setting, should be Off: " + result1 );
		
		lamp.click();
		Boolean result2 = compare(lamp.getSetting(), "Low");
		System.out.println("Click! \n Should now be Low: " + result2 );
		
		lamp.click();
		Boolean result3 = compare(lamp.getSetting(), "Medium");
		System.out.println("Click! \n Should now be Medium: " + result3 );
		
		lamp.click();
		Boolean result4 = compare(lamp.getSetting(), "High");
		System.out.println("Click! \n Should now be High: " + result4 );
		
		lamp.click();
		Boolean result5 = compare(lamp.getSetting(), "Off");
		System.out.println(lamp.getSetting());
		System.out.println("Click! \n Should now be Off: " + result5);
		
		if (result1 && result2 && result3 && result4 && result5) {
			System.out.println("All tests succesfull!");
		} else {
			System.out.println("Test Failed");

		}
	}
	
	public Boolean compare(String real, String shouldBe){
		if (real.equals(shouldBe)){
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ThreeWayLampTest test = new ThreeWayLampTest();
		ThreeWayLamp2 lamp = new ThreeWayLamp2();
		test.Test(lamp);
		
	}

}
