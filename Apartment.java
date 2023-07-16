
public class Apartment extends Residential {
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		numRentableUnits=0;
		avgUnitSize=0;
		parkingAvailable=false;
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
		projectName = "";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0;
	}//end empty argument constructor
	
	public Apartment( String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		numRentableUnits=0;
		avgUnitSize=0;
		parkingAvailable=false;
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
	}//end preferred argument constructor
	
	//Getters and Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	//Methods
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method

	public String displayData() {
	StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + this.projectName);
		sb.append("\nComplete address: " + this.completeAddress);
		sb.append("\nTotal Square Feet: " + this.totalSquareFeet);
		sb.append("\nOccupancy Group: " + this.occupancyGroup);
		sb.append("\nSubgroup: " + this.subgroup);
		sb.append("\nLaundry Room: " + this.laundryRoom);
		sb.append("\nNumber of Bedrooms: " + this.numBedrooms);
		sb.append("\nNumber of Bathrooms: " + this.numBathrooms);
		sb.append("\nNumber of Rentable Units: " + numRentableUnits);
		sb.append("\nAverage Size of Unit: " + avgUnitSize);
		sb.append("\nParking Available: " + parkingAvailable);
		sb.append("\n");
		return sb.toString();
	}//end display data	
	
}//end class
