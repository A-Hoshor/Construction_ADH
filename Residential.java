
public class Residential extends Building {
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//Constructors
	public Residential() {
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
		projectName = "";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0;
		
	}//end empty argument constructor
	
	public Residential (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
	}//end preferred argument constructor

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + this.projectName);
		sb.append("\nComplete address: " + this.completeAddress);
		sb.append("\nTotal Square Feet: " + this.totalSquareFeet);
		sb.append("\nOccupancy Group: " + this.occupancyGroup);
		sb.append("\nSubgroup: " + this.subgroup);
		sb.append("\nLaundry Room: " + this.laundryRoom);
		sb.append("\nNumber of Bedrooms: " + this.numBedrooms);
		sb.append("\nNumber of Bathrooms: " + this.numBathrooms);
		sb.append("\n");
		return sb.toString();
	}//end toString

}//end class
