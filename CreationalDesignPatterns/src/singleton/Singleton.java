package singleton;

public class Singleton {
	//hi� kullan�lmasa bile nesne olu�ur
	
	private static Singleton singleton = new Singleton();
	
	private static int number = 0;
	
	private Singleton() {
		System.out.println("I was created");
	}
	
	//bir nesneyi newlemeden o nesneye ait bir metodu kullanmak i�in static yap�l�r
	//static metotlar�n i�erisinde sadece static de�i�kenler kullan�m�na izin verilir.
	public static Singleton getSingleton() {
		number++;
		System.out.println(number);
		return singleton;
	}
}
