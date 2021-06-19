package abstractFactory;

public class TelefonBayisi {
	public static void main(String[] args) {
		S8Fabrikasý S8Fabrikasý = new S8Fabrikasý();
		Telefon s8 = S8Fabrikasý.getTelefon("s8", "2600mah", 4, 7);
		
		Note8Factory note8Factory = new Note8Factory();
		Telefon note8 = note8Factory.getTelefon("note8", "3000mah", 5, 8);
		
		System.out.println(s8);
		System.out.println(note8);
	}

}
