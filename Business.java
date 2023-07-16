
public class Business extends Building{
	
	protected int numRentableUnits;
	
	public Business() {
		this.projectName="";
		this.completeAddress="";
		this.totalSquareFeet=0;
		this.occupancyGroup="";
		this.subgroup="";
	}//end empty argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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
	
	//Methods
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + this.projectName);
		sb.append("\nComplete address: " + this.completeAddress);
		sb.append("\nTotal Square Feet: " + this.totalSquareFeet);
		sb.append("\nOccupancy Group: " + this.occupancyGroup);
		sb.append("\nSubgroup: " + this.subgroup);
		sb.append("\nNumber of Rentable Units: " + numRentableUnits);
		sb.append("\n");
		return sb.toString();
	}//end toString
}//end class
