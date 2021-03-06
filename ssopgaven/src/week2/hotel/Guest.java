package week2.hotel;

/**
 * Hotel guest with a name and possibly a hotel room.
 * @author Stephan Braams
 * @version 1.0
 *
 */
public class Guest extends java.lang.Object {
	// ------------------ Instance variables ----------------

    private String name;
    private Room kamertje;

    // ------------------ Constructor ------------------------
    /**
	 * Creates a <code>Guest</code> with the given name and without <code>Room</code>
	 * @param <code>n</code> - name of the new <code>Guest</code>
	 */
	public Guest(String n){
		name = n;
	}
        // ------------------ Queries --------------------------

    /**
     * Returns the name of this <code>Guest</code>.
     */
    public String getName() {
    	return name;
    }

    /**
     * Returns the <code>Room</code> that is rented by this <code>Guest</code>.
     * @return <code>Room</code> rented by thus <code>Guest</code>;
     *         <code>null</code> if this <code>Guest</code> 
     *         does not rent a room
     */
    public Room getRoom() {
    	return kamertje;
    }

    // ------------------ Commands --------------------------

    /**
     * Rents a <code>Room</code> to this <code>Guest</code>. 
     * This is only possible if this <code>Guest</code> does not already have a <code>Room</code>. 
     * and the <code>Room</code> to be assigned is not already rented.
     * Also adapts the <code>Guest</code>-reference of the <code>Room</code>.
     * @param <code>r</code> - <code>Room</code> 
     * 			to be rented to this <code>Guest</code>; 
     * 			may not be <code>null</code>
     * @return true if checkin succeeded; 
     * 			false if this Guest already had a Room,
     * 		 	or r already had a Guest.
     */
    public boolean checkin(Room r) {
    	if(r.getGuest()==null 
    			&& this.getRoom()==null){
    		r.setGuest(this);
    		kamertje = r;
    		return true;
    	}
    	else{
    		return false;
    	}
    	    	    }
    
    /**
     * Sets the <code>Room</code> of this <code>Guest</code> to <code>null</code>. 
     * Also resets the <code>Guest</code>-reference of the (current) <code>Room</code>.
     * @return <code>true</code> if this action succeeded;
     *  <code>false</code> if <code>Guest</code> does not have a <code>Room</code> 
     *  when this method is called
     */
    public boolean checkout(){
    	
    	  if(this.getRoom()==null){
    	  return false;
    	  }
    	  else {
    	  kamertje.setGuest(null);
    	  kamertje=null;
    	  return true;
    	  }
    	
    }
    /**
     * A string representations of this object
     */
    public String toString() {
        return "Guest "+ name + " " + kamertje.toString() ;
    }
	
}


