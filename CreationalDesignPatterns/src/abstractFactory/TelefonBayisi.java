package abstractFactory;

public class TelefonBayisi {
	public static void main(String[] args) {
		S8Fabrikas� S8Fabrikas� = new S8Fabrikas�();
		Telefon s8 = S8Fabrikas�.getTelefon("s8", "2600mah", 4, 7);
		
		Note8Factory note8Factory = new Note8Factory();
		Telefon note8 = note8Factory.getTelefon("note8", "3000mah", 5, 8);
		
		System.out.println(s8);
		System.out.println(note8);
	}

}
