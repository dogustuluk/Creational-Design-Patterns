package builder;

public class House {
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
	
	



	

	@Override
	public String toString() {
		return "House [province=" + province + ", district=" + district + ", street=" + street + ", buildingYear="
				+ buildingYear + ", numberOfRooms=" + numberOfRooms + ", numberOfBathrooms=" + numberOfBathrooms
				+ ", numberOfToilets=" + numberOfToilets + ", numberOfBalconies=" + numberOfBalconies + ", isDublex="
				+ isDublex + ", isFurnished=" + isFurnished + ", isCarPark=" + isCarPark + ", isChildPark="
				+ isChildPark + ", isAirConditioner=" + isAirConditioner + ", isPool=" + isPool + "]";
	}



	public House() {}



	public House(String province, String district, String street, int buildingYear, int numberOfRooms,
			int numberOfBathrooms, int numberOfToilets, int numberOfBalconies, boolean isDublex, boolean isFurnished,
			boolean isCarPark, boolean isChildPark, boolean isAirConditioner, boolean isPool) {
		super();
		this.province = province;
		this.district = district;
		this.street = street;
		this.buildingYear = buildingYear;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfToilets = numberOfToilets;
		this.numberOfBalconies = numberOfBalconies;
		this.isDublex = isDublex;
		this.isFurnished = isFurnished;
		this.isCarPark = isCarPark;
		this.isChildPark = isChildPark;
		this.isAirConditioner = isAirConditioner;
		this.isPool = isPool;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public int getBuildingYear() {
		return buildingYear;
	}



	public void setBuildingYear(int buildingYear) {
		this.buildingYear = buildingYear;
	}



	public int getNumberOfRooms() {
		return numberOfRooms;
	}



	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}



	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}



	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}



	public int getNumberOfToilets() {
		return numberOfToilets;
	}



	public void setNumberOfToilets(int numberOfToilets) {
		this.numberOfToilets = numberOfToilets;
	}



	public int getNumberOfBalconies() {
		return numberOfBalconies;
	}



	public void setNumberOfBalconies(int numberOfBalconies) {
		this.numberOfBalconies = numberOfBalconies;
	}



	public boolean isDublex() {
		return isDublex;
	}



	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}



	public boolean isFurnished() {
		return isFurnished;
	}



	public void setFurnished(boolean isFurnished) {
		this.isFurnished = isFurnished;
	}



	public boolean isCarPark() {
		return isCarPark;
	}



	public void setCarPark(boolean isCarPark) {
		this.isCarPark = isCarPark;
	}



	public boolean isChildPark() {
		return isChildPark;
	}



	public void setChildPark(boolean isChildPark) {
		this.isChildPark = isChildPark;
	}



	public boolean isAirConditioner() {
		return isAirConditioner;
	}



	public void setAirConditioner(boolean isAirConditioner) {
		this.isAirConditioner = isAirConditioner;
	}



	public boolean isPool() {
		return isPool;
	}



	public void setPool(boolean isPool) {
		this.isPool = isPool;
	}

	
	
	
	
	
}
