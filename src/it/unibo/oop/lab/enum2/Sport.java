/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */

    BASKET(Place.INDOOR, 5, "Basket"), VOLLEY(Place.INDOOR, 6, "Volley"), TENNIS(Place.INDOOR, 1, "Tennis"),
    BIKE(Place.OUTDOOR, 1, "Bike"), F1(Place.OUTDOOR, 1, "F1"), MOTOGP(Place.OUTDOOR, 1, "MotoGP"),
    SOCCER(Place.OUTDOOR, 11, "Soccer");

    /*
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */

    private final int members;
    private final String name;
    private final Place playingfield;

    /*
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */

    /**
     * Builds a new {@link Sport}.
     * 
     * @param place         the place where the sport is played
     * @param noTeamMembers the number of team members
     * @param actualName    the name of the sport
     */
    Sport(final Place place, final int noTeamMembers, final String actualName) {
	this.playingfield = place;
	this.members = noTeamMembers;
	this.name = new String(actualName);
    }

    /*
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */

    /**
     * @return true if the sport is individual
     */
    public boolean isIndividualSport() {
	return this.members == 1;
    }

    /**
     * @return true if the sport is played indoor
     */
    public boolean isIndoorSport() {
	return this.playingfield == Place.INDOOR;
    }

    /**
     * @return the place where the sport is played
     */
    public Place getPlace() {
	return this.playingfield;
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
	return this.name + " is played with " + this.members + " player(s) on an " + getPlace() + " field";
    }

}
