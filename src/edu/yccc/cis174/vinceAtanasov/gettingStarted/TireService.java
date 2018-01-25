package edu.yccc.cis174.vinceAtanasov.gettingStarted;

/**
 * 
 * @author Vince
 *
 */
import java.util.ArrayList;
import java.util.List;

public class TireService {
	// Creating an empty list for the tires.
	public static List<Tire> tires = new ArrayList<Tire>();

	// Method that fills up the list with tires.
	public void loadTires() {
		tires.add(new Tire("Pirelli", "Scorpion winter", "Winter tire", "225/55/R19"));
		tires.add(new Tire("Bridgestone", "Blizzak DM-V2", "Winter tire", "225/65/R17"));
		tires.add(new Tire("Michelin", "Latitude X-Ice XI2", "Winter tire", "235/60/R17"));
		tires.add(new Tire("Continental", "Wintercontact SI", "Winter tire", "245/45/R18"));
		tires.add(new Tire("Bridgestone", "Driveguard", "All season", "245/40/R19"));
		tires.add(new Tire("Pirelli", "Cinturato P7", "All season", "205/65/R16"));
		tires.add(new Tire("Hankook", "Optimo H426", "All season", "255/45/R20"));
		tires.add(new Tire("Kumho", "Solus KH16", "All season", "255/60/R17"));
		tires.add(new Tire("Pirelli", "Scorpion winter", "Winter tire", "225/55/R19"));
		// Printing out the array with the tires in it.
		System.out.println(tires);
	}

	// Method that deletes each tire from the list one by one until the list is
	// empty. We are passing the full list of tires as an argument.
	public void deleteTires(List<Tire> tires) {
		// Loop that goes around the whole list and stops when it reaches the end of it.
		for (int i = 0; i < tires.size();) {
			tires.remove(i);
			System.out.println(tires);
		}
		System.out.println("Done!");
	}

	// The main method
	public static void main(String[] args) {
		// Creating instance of tire.
		TireService tire = new TireService();
		// Calling the loadTires method.
		tire.loadTires();
		// Calling the deleteTires method.
		tire.deleteTires(tires);
	}

}
