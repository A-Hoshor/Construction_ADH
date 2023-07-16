
public class Mall extends Business {
	
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		numRentedUnits=0;
		medianUnitSize=0;
		numParkingSpaces=0;
		projectName = "";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0;
		
	}//end empty argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//end preferred argument constructor
	
	//Getters and setters
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
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
		sb.append("\nNumber of Rentable Units: " + this.numRentableUnits);
		sb.append("\nNumber of rented Units: " + this.numRentedUnits);
		sb.append("\nMedian Unit Size: " + this.medianUnitSize);
		sb.append("\nNumber of Parking Spaces: " + this.numParkingSpaces);
		sb.append("\n");
		return sb.toString();
	}//end display data method


	
	
}//end class
