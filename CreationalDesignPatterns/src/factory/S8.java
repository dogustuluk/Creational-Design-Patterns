package factory;

public class S8 implements Phone{
	private String model;
	private String battery;
	private int width;
	private int size;
	
	
	
	
	public S8(String model, String battery, int width, int size) {
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
	@Override
	public String getBattery() {
		
		return battery;
	}
	@Override
	public int getWidth() {
		
		return width;
	}
	@Override
	public int getSize() {
		
		return size;
	}
	
	@Override
	public String toString() {
		return "S8{" +
				"model='" + model + '\'' +
				", battery='" + battery + '\'' +
				", width=" + width +
				", size=" + size +
				'}';
	}
	
	

}
