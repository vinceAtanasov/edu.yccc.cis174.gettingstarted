package edu.yccc.cis174.vinceAtanasov.gettingStarted;
/** @author Vince
 * 	1. Inheritance - This is the ability of creating a new class from an existing one. Inheritance is when an object acquires the property of another object.
 * 	2. Abstraction - This is the process of hiding out the working style of an object and showing only the required information of the object in understandable manner.
 *	3. Polymorphism - This is the ability of an object to take many forms.
 *	4. Encapsulation - This is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
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
