package week2;

public class Rectangle {
	
	// Length and width must be non-negative.
	//@ private invariant lengt >= 0;
	private int lengt;
	//@ private invariant widt >= 0;
	private int widt;	
	
	/**
	 * Create a new <code>Rectangle</code> with the specified length and width. Length and width must be non-negative.
	 * @param lenght
	 * @param width
	 */
	// Length and width must be non-negative.
	//@ requires length >= 0;
	//@ requires width >= 0;
	//@ ensures length() == length;
	//@ ensures width() == width();
	public  Rectangle (int length, int width){	
		assert (length >= 0) : "error";
		assert (width >= 0) : "error";
		
		lengt = length;
		widt = width;
		
		assert (length() == length) : "error";
		assert (width() == width()) : "error";
	}

	/**
	 * The length of this  <code>Rectangle</code>
	 * @return
	 */
	// Must return non-negative length.
	//@ ensures \result >= 0;
	
	public int length(){
		assert (lengt >= 0) : "error";
		return lengt;
	}
	
	/**
	 * The width of this  <code>Rectangle</code>
	 * @return
	 */
	// Must return non-negative width.
	//@ ensures \result >= 0;
	
	public int width (){
		assert (widt >= 0) : "error";
		return widt;
	}
	
	/**The area if this  <code>Rectangle</code>
	 * 
	 * @return
	 */
	// Must return non-negative area.
	//@ ensures \result >= 0;
	
	public int area (){
		assert (lengt >= 0) : "error";
		assert (widt >= 0) : "error";
		return lengt * widt;
	}
	
	/**
	 * The perimeter of this  <code>Rectangle</code>
	 * @return
	 */
	// Must return non-negative perimeter.
	//@ ensures \result >= 0;
	
	public int perimeter (){
		assert (lengt >= 0) : "error";
		assert (widt >= 0) : "error";
		return 2 * (lengt + widt);
	}
	
}