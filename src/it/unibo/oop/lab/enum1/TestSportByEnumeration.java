package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() {
    }

    /**
     * @param args ignored
     */
    public static void main(final String... args) {

	SportSocialNetworkUserImpl<User> rmaria = new SportSocialNetworkUserImpl<>("Maria", "Rossi", "rmaria", 20);
	SportSocialNetworkUserImpl<User> vlucia = new SportSocialNetworkUserImpl<>("Lucia", "Verdi", "vlucia", 16);
	SportSocialNetworkUserImpl<User> bsara = new SportSocialNetworkUserImpl<>("Sara", "Bianchi", "bsara", 30);

	// Maria follows bike, soccer and volley
	rmaria.addSport(Sport.BIKE);
	rmaria.addSport(Sport.SOCCER);
	rmaria.addSport(Sport.VOLLEY);

	// Lucia follows only volley
	vlucia.addSport(Sport.VOLLEY);

	// Sara follows F1, soccer and MotoGP
	bsara.addSport(Sport.F1);
	bsara.addSport(Sport.SOCCER);
	bsara.addSport(Sport.MOTOGP);
	bsara.addSport(Sport.VOLLEY);

	//Tests
	System.out.println("Maria follows bike: " + rmaria.hasSport(Sport.BIKE));
	System.out.println("Lucia doesn't follow F1: " + !vlucia.hasSport(Sport.F1));
	System.out.println("Sara follows soccer: " + bsara.hasSport(Sport.SOCCER));
	System.out.println("Sara, Maria and Lucia all follow volley: "
		+ (vlucia.hasSport(Sport.VOLLEY) && rmaria.hasSport(Sport.VOLLEY) && bsara.hasSport(Sport.VOLLEY)));

    }
}
