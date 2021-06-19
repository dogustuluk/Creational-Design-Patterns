package abstractFactory;

public class Note8Factory implements TelefonFactory {

	@Override
	public Telefon getTelefon(String model, String batarya, int en, int boy) {
		return new S8(model,batarya,en,boy);
	}

}
