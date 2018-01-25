package gettingStarted;
/**
 * 
 * @author Vince
 *
 */
public class Tire {
	private String brand;
	private String type;
	private String size;
	private boolean runFlat;
	// Creating an empty constructor.
	public Tire() {

	}
	// Creating a constructor 
	public Tire(String brand, String type, String size, boolean runFlat) {
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.runFlat = runFlat;
	}
	// Setting up all the setters.
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setRunFlat(boolean runFlat) {
		this.runFlat = runFlat;
	}
	// Setting up all the getters.
	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}

	public boolean getRunFlat() {
		return runFlat;
	}

}
