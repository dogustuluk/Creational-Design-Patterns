package factory;

public class Note8 implements Phone{
	
	private String model;
	private String battery;
	private int width;
	private int size;
	
	
	
	
	public Note8(String model, String battery, int width, int size) {
		super();
		this.model = model;
		this.battery = battery;
		this.width = width;
		this.size = size;
	}
	@Override
	public String getModel() {
		
		return model;
	}
	public String getBattery() {
		return battery;
	}
	public int getWidth() {
		return width;
	}
	public int getSize() {
		return size;
	}
	
	
	
	
	


}
