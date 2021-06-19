package builder;

public class RealEstateAgentV2 {

	public static void main(String[] args) {
		
			House house1 =HouseBuilder.startStandartHouseBuilder("istanbul","ümraniye","tatlısu",2008,3)
			
			.setChildPark(true)
			.setCarPark(true)
			
			.build();
			
			
	
	
				
			House ev2 =HouseBuilder.startHouseWithPoolBuilder("istanbul","Ataşehir","Atatürk",2010,4)
						
				.setChildPark(true)
				.setOtopark(true)
				.build();
						
			
				printEv(house1);

				printEv(ev2);

	}	
	
	
	private static void printEv(House ev) {
		System.out.println();
		
		System.out.println("house added ->" + ev);
	}
}
