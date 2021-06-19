package factory;

public class PhoneDealer {
	
	public static void main(String[] args) {
		
		Phone s8 =  PhoneFactory.getTelefon("S8", "2600mah", 4, 7);
		Phone note8 =PhoneFactory.getTelefon("note8", "3000", 5, 8);
		
		System.out.println("phone specs for s8:");
		System.out.println(s8);
		
		System.out.println("phone specs for note8:");
		System.out.println(note8);
		
	}

}
