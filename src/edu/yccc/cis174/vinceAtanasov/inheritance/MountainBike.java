package edu.yccc.cis174.vinceAtanasov.inheritance;

public class MountainBike extends Bike {
	boolean hasSuspension;
	boolean isFatBike;
	
	public MountainBike() {
		super();
		setGearCount(12);
		this.hasSuspension = true;
		this.isFatBike = true;
	}

	public boolean isHasSuspension() {
		return hasSuspension;
	}

	public void setHasSuspension(boolean hasSuspension) {
		this.hasSuspension = hasSuspension;
	}

	public boolean isFatBike() {
		return isFatBike;
	}

	public void setFatBike(boolean isFatBike) {
		this.isFatBike = isFatBike;
	}

	public String toString() {
		return super.toString() + " hasSuspension = " + hasSuspension + " isFatBike = " + isFatBike;

	}

}
