
public class SingleFamilyHome extends Residential {
	
	private boolean garage;
	
	public SingleFamilyHome() {
		
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
		projectName = "";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0;
		garage=false;
		
	}//end empty argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
	
		garage=false;
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//end preferred argument constructor
	
	//Getters and Setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

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
		sb.append("\nGarage: " + this.garage);
		sb.append("\nLaundry Hookup: " + this.laundryRoom);
		sb.append("\n");
		return sb.toString();
	}//end display data
	
}//end class
