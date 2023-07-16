
public class Application {

	public static void main(String[] args) {
		
		//Test Building Constructors,Getters, Setters, and Methods
		Building b=new Building();
		b.setProjectName("Building Project");
		System.out.println(b.getProjectName());
		
		b.setCompleteAddress("123 Address Drive");
		System.out.println(b.getCompleteAddress());
		
		b.setTotalSquareFeet(700);
		System.out.println(b.getTotalSquareFeet());
		
		b.setOccupancyGroup("Residential");
		System.out.println(b.getOccupancyGroup());
		
		b.setSubgroup("R3");
		System.out.println(b.getSubgroup());
		
		System.out.println(b.displayData());
		
		//Test Residential Constructors, Getters, Setters, and Methods
		Residential r=new Residential("Residential Project", "415610 Residential Dr", 500, "Residential", "R4");
		r.setLaundryRoom(true);
		System.out.println(r.isLaundryRoom()); 
		
		r.setNumBathrooms(2);
		System.out.println(r.getNumBathrooms());
		
		r.setNumBedrooms(2);
		System.out.println(r.getNumBedrooms());
		
		System.out.println(r.toString());
		
		//Test Business Constructors, Getters, Setters and Methods
		Business bus= new Business("Business Project", "13 Buisiness Lane", 10000, "Business", "B");
		bus.setNumRentableUnits(15);
		System.out.println(bus.getNumRentableUnits());
		
		System.out.println(bus.toString());
		
		//Test Mall Constructors, Getters, Setters, and Methods
		Mall m=new Mall("Mall Project", "876 Mall Circle", 9000, "Business", "B");
		m.setMedianUnitSize(500.5);
		System.out.println(m.getMedianUnitSize());
		
		m.setNumParkingSpaces(300);
		System.out.println(m.getNumParkingSpaces());
		
		m.setNumRentableUnits(16);
		System.out.println(m.getNumRentableUnits());
		
		m.setNumRentedUnits(10);
		System.out.println(m.getNumRentedUnits());
		
		System.out.println(m.displayData());
		
		//Test Apartment constructors, getters, setters, and methods
		Apartment a=new Apartment("Golden Meadows", "1564 Another Street", 100000.7, "Residential", "R-1");
		a.setAvgUnitSize(1500);
		System.out.println(a.getAvgUnitSize());
		
		a.laundryRoom=true;
		System.out.println(a.isLaundryRoom());
		
		a.setNumBathrooms(3);
		System.out.println(a.getNumBathrooms());
		
		a.setNumBedrooms(4);
		System.out.println(a.getNumBedrooms());
		
		a.setNumRentableUnits(25);
		System.out.println(a.getNumRentableUnits());
		
		a.setParkingAvailable(true);
		System.out.println(a.isParkingAvailable());
		
		System.out.println(a.displayData());
		
		//Test Single Family Home constructors, getters, setters, and methods
		SingleFamilyHome s=new SingleFamilyHome("Broadmoor Property", "1574 Stacy Dr", 3000, "Residential", "R-2");
		s.setGarage(true);
		System.out.println(s.isGarage());
		
		s.setLaundryRoom(true);
		System.out.println(s.isLaundryRoom());
		
		s.setNumBathrooms(4);
		System.out.println(s.getNumBathrooms());
		
		s.setNumBedrooms(5);
		System.out.println(s.getNumBedrooms());
		
		System.out.println(s.displayData());
		

	}// end main

}//end class
