package gettingStarted;
/**
 * 
 * @author Vince
 *
 */
public class Tire {
	private String brand;
	private String model;
	private String type;
	private String size;
	// Creating an empty constructor.
	public Tire() {

	}
	// Creating a constructor 
	public Tire(String brand, String model, String type, String size) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.size = size;
	}
	// Setting up all the setters.
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// Setting up all the getters.
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getSize() {
		return size;
	}


	public String toString() {
		return this.brand + " " + this.model + " " + this.type + " " + this.size;
	}
}
