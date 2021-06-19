package abstractFactory;

public class S8Fabrikasý implements TelefonFactory{

	@Override
	public Telefon getTelefon(String model, String batarya, int en, int boy) {
		// TODO Auto-generated method stub
		return new S8(model,batarya,en,boy);
	}

}
