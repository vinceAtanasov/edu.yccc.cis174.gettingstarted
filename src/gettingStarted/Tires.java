package gettingStarted;

public class Tires {
	private String brand;
	private String type;
	private String size;
	private boolean runFlat;
	
	public Tires() {
		
	}
	
	public Tires(String brand, String type, String size, boolean runFlat) {
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.runFlat = runFlat;
	}
	
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
	
	}
