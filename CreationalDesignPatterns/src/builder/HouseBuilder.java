package builder;

public class HouseBuilder {
	private String province;
	private String district;
	private String street ;
	
	private int buildingYear;
	private int numberOfRooms;
	private int numberOfBathrooms;
	private int numberOfToilets;
	private int numberOfBalconies;
	
	private boolean isDublex;
	private boolean isFurnished;
	private boolean isCarPark;
	private boolean isChildPark;
	private boolean isAirConditioner;
	private boolean isPool;
	
	
	//Essential fields
	public static HouseBuilder startStandartHouseBuilder(String province, String district, String street, int buildingYear, int numberOfRooms) {
		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.province = province;
		houseBuilder.district = district;
		houseBuilder.street = street;
		houseBuilder.buildingYear = buildingYear;
		houseBuilder.numberOfRooms = numberOfRooms;
		
		return houseBuilder;
	}
	
	
	public static HouseBuilder startHouseWithPoolBuilder(String province, String district, String street, int buildingYear, int numberOfRooms) {
		HouseBuilder houseBuilder = new HouseBuilder();
		houseBuilder.province = province;
		houseBuilder.district = district;
		houseBuilder.street = street;
		houseBuilder.buildingYear = buildingYear;
		houseBuilder.numberOfRooms = numberOfRooms;
		houseBuilder.isPool = true;
		return houseBuilder;
	}


	
	
	
	public House build() {
		House house = new House();
		house.setProvince(province);
		house.setDistrict(district);
		house.setStreet(street);
		
		house.setBuildingYear(buildingYear);
		house.setNumberOfRooms(numberOfRooms);
		house.setNumberOfBathrooms(numberOfBathrooms);
		house.setNumberOfToilets(numberOfToilets);
		house.setNumberOfBalconies(numberOfBalconies);
		
		house.setDublex(isDublex);
		house.setFurnished(isFurnished);
		house.setCarPark(isCarPark);
		house.setChildPark(isChildPark);
		house.setAirConditioner(isAirConditioner);
		house.setPool(isPool);
		
		return house;
	}


	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}


	public void setNumberOfToilets(int numberOfToilets) {
		this.numberOfToilets = numberOfToilets;
	}


	public void setNumberOfBalconies(int numberOfBalconies) {
		this.numberOfBalconies = numberOfBalconies;
	}


	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}


	public void setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
	}


	public void setCarPark(boolean isCarPark) {
		this.isCarPark = isCarPark;
	}


	public void setChildPark(boolean isChildPark) {
		this.isChildPark = isChildPark;
	}


	public void setAirConditioner(boolean isAirConditioner) {
		this.isAirConditioner = isAirConditioner;
	}


	public void setPool(boolean isPool) {
		this.isPool = isPool;
	}
	
	
	

	
	

}
