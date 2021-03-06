package week1.hotel;


/**
 * Representation of a password. Lab exercise Softwaresystems
 * @author Stephan Braams
 * @version 1.0
 *
 */
public class Password extends java.lang.Object  {
	// ------------------ Instance variables ----------------
	/**
	 * The standard initial password.
	 */
	public static String INITIAL = "password";
	public String password;
	
   // ------------------ Constructor ------------------------
    /**
     * Constructs a Password with the initial word provided in INITIAL.
	 */
	public Password(){
		password = INITIAL;
	}
        // ------------------ Queries --------------------------
    /**
     * Test if a given string is an acceptable password.
     * Not acceptable: A word with less than 6 characters 
     * or a word that contains a space.
     * @param suggestion - Word that should be tested
     * @return true If suggestion is acceptable
     */
    public boolean acceptable (String suggestion) {
    	return suggestion.length()>5 && !suggestion.contains(" ");
    }

    /**
     * Tests if a given word is equal to the current password.
     * @Param test - Word that should be tested
     * @return true If test is equal to the current password

    */
    public boolean testWord  (String testWord) {
    	return testWord.equals(password) ;
    }
    
    /**
     * Changes this password.
     * @param oldpass - The current password 
     * 			newpass - The new password
     * @return true if old is equal to the current password and that newpass is an acceptable password
     */
    public boolean setWord (String oldpass, String newpass){
    	Boolean check = false;
    	check = testWord(oldpass) && acceptable(newpass);
    	if (check){
    		password = newpass;
    	}
    	return check;
    }

    // ------------------ Commands --------------------------

    
  
}


