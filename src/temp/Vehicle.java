package temp;

import java.lang.String;

public class Vehicle {
	private String make;
	private String model;
	private String year;
	private String color;
	private String doors;
	
	public Vehicle (String make, String model, String year, String color, String doors) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.doors = doors;
		  
	}
	
	public Vehicle() {
		
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
		
	}

	public void setYear(String year) {
		this.year = year;
		
		
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	public String getDoors() {
		return doors;
	}
	
	public String toString() {
		return this.year + " " + this.make + " " + this.model + " " + this.color + " " + this.doors;
				
	}

}
