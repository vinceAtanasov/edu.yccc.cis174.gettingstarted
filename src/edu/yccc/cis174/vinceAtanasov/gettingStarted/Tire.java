package edu.yccc.cis174.vinceAtanasov.gettingStarted;
/**
 * 
 * @author Vince
 *
 */
public class Tire {
	// Creating all of the variables.
	private String brand;
	private String model;
	private String type;
	private String size;
	// Creating an empty constructor.
	public Tire() {

	}
	// Creating a constructor with passing arguments brand, model, type and size. 
	public Tire(String brand, String model, String type, String size) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.size = size;
	}
	// Setting up all the setters for the object Tire.
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

	// Setting up all the getters for the object Tire.
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

	// Method that returns the value for brand, model, type and size.
	public String toString() {
		return this.brand + " " + this.model + " " + this.type + " " + this.size;
	}
}
