
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		
		projectName = "";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0;
		
	}//end empty argument constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		
	}//end preferred argument constructor
	
	//Getters and Setters
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
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
		sb.append("\n");
		return sb.toString();
	}//end displayData method
}//end class
