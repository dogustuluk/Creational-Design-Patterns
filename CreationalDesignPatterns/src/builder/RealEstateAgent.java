package builder;

public class RealEstateAgent {

	public static void main(String[] args) {
		House house1= new House();
		house1.setProvince("İstanbul");
		house1.setDistrict("Ataşehir");
		house1.setStreet("Atatürk");
		house1.setNumberOfRooms(3);
		house1.setBuildingYear(2010);
		house1.setAirConditioner(true);
		
		
		House house2 = new House("İstanbul","Ümraniye","Tatlısu",2008,2,3,2,0,false,false,true,true,true,false);
		
		printEv(house1);
		printEv(house2);
	}
	
	private static void printEv(House house) {
		System.out.println();
		
		System.out.println("house added ->" + house);
	}

}
