package singleton;

public class Singleton {
	//hiç kullanýlmasa bile nesne oluþur
	
	private static Singleton singleton = new Singleton();
	
	private static int number = 0;
	
	private Singleton() {
		System.out.println("I was created");
	}
	
	//bir nesneyi newlemeden o nesneye ait bir metodu kullanmak için static yapýlýr
	//static metotlarýn içerisinde sadece static deðiþkenler kullanýmýna izin verilir.
	public static Singleton getSingleton() {
		number++;
		System.out.println(number);
		return singleton;
	}
}
