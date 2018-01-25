package gettingStarted;


import java.util.ArrayList;
import java.util.List;

public class TireService {
	// Creating an empty list for the tires.
	public List<Tire> tires = new ArrayList <Tire>();
	
	public void loadTires() {
		tires.add(new Tire("Pirelli", "Winter tire", "225/55/R19", false));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
