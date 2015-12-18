package week2.hotel;


/**
 * @author Stephan Braams
 * @version 1.0 *
 */
public class Safe {

	// ------------------ Instance variables ----------------

	public enum Active {OFF, ON};
	public enum State {OPEN, CLOSED};
	public Active active;
	public State state;
	//@ public invariant password.acceptable(password.getWord()) == true;
	public Password password;
	

	// ------------------ Constructor -----------------------
	
	/**
	 * Creates a new deactivated with password "newPassword"
	 * @param newPassword. a valid new password
	 */
	//@ ensures password == newPassword;

	public Safe(Password newPassword){
		password = newPassword;
	}

	// ------------------ Queries --------------------------

	/**
	 * Checks if the safe is Active
	 * @result true is Active, false if deactivated
	 */
	//@ ensures active == active.ON ==> \result == true;
	//@ ensures active == active.OFF ==> \result == false;
	public boolean isActive() {
		Boolean result = active.equals(Active.ON);
		return result;
	}
	
	/**
	 * Checks if the safe is open
	 * @result true is open, false if closed
	 */
	//@ ensures state == State.OPEN ==> \result == true;
	//@ ensures state == State.CLOSED ==> \result == false;
	public boolean isOpen() {
		Boolean result = state.equals(State.OPEN);
		return result;
	}
	
	/**
	 * Returns the password
	 * @result password
	 */
	//@ ensures \result == password;
	public Password getPassword() {
		return password;
	}
	
	// ------------------ Commands --------------------------

	/**
	 * Sets the safe to on
	 */
	//@ ensures Active == Active.ON;
	public void activate(String tryPassword){
		Boolean passIsCorrect = tryPassword.equals(password.getWord());
		if (passIsCorrect){
			state = State.OPEN  ;
		}

		active = Active.ON;
	}
	
	/**
	 * Sets the safe to off
	 */
	//@ ensures Active == Active.OFF;
	public void deactivate(){
		active = Active.OFF;
	}
	
	/**
	 * Enters a password. Opens i it is correct
	 * @param tryPassword password to be tried
	 * @result  true if password is vald, false if it is not.
	 */
	//@ requires password.acceptable(tryPassword) == true;
	//@ ensures tryPassword == password.getWord() ==> \result == true;
	//@ ensures tryPassword != password.getWord() ==> \result == false;
	public void open(String tryPassword) {
		Boolean passIsCorrect = tryPassword.equals(password.getWord());
		if (passIsCorrect){
			state = State.OPEN  ;
		}
	}

	/**
	 * Closes the save
	 */
	//@ ensures state == State.CLOSED;
	public void close() {
		state = State.CLOSED;
	}
}



