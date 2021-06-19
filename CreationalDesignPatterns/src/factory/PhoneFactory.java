package factory;

public class PhoneFactory {
	
	public static Phone getTelefon(String model, String battery, int width, int size) {
		//else-if lerin çokluðu dezavantaj yaratmaktadýr. çözümü için abstract factory kalýbý kullanýlýr
		
		Phone telefon;
		if("S8".equalsIgnoreCase(model)) {
			telefon = new S8(model,battery,width,size);
		}else if("Note8".equalsIgnoreCase(model)) {
			telefon = new Note8(model, battery, width, size);
		}else {
			throw new RuntimeException("geçerli bir model deðildir");
		}
		return telefon;
	}

}
