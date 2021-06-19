package factory;

public class PhoneFactory {
	
	public static Phone getTelefon(String model, String battery, int width, int size) {
		//else-if lerin �oklu�u dezavantaj yaratmaktad�r. ��z�m� i�in abstract factory kal�b� kullan�l�r
		
		Phone telefon;
		if("S8".equalsIgnoreCase(model)) {
			telefon = new S8(model,battery,width,size);
		}else if("Note8".equalsIgnoreCase(model)) {
			telefon = new Note8(model, battery, width, size);
		}else {
			throw new RuntimeException("ge�erli bir model de�ildir");
		}
		return telefon;
	}

}
