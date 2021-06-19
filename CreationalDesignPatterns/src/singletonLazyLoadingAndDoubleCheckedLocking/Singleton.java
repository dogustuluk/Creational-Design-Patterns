package singletonLazyLoadingAndDoubleCheckedLocking;


public class Singleton {
	
	private static Singleton singleton;
	
	private static int number = 0;
	
	private Singleton() {
		System.out.println("I was created");
	}
	
	
	public static Singleton getSingleton() {
		
		//synchronizde metodunun �ok yava� �al��mas�n� �nlemek i�in >>>>>>if(singleton == null) kontrol� getirilir.
		// bu tip i� i�e null kontrol�n�n ad� <<>>>>>>>>>>>double checked locking denir
		if(singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		
		/*if (singleton == null) {
			singleton = new Singleton();
		}
		//yap�lan if kontrol� multithread �al���nca sistemde a��k verir. bunun i�in yukar�daki synchronized komutlar� yaz�l�r.
		 * fakat bunu yap�nca metodun �al��mas�n� ciddi bir �ekilde yava�lat�r. ��nk� bu s�zc�k ile (synchronized) kar��las�nca metodlar kuyru�a girer.
		 
		*/
		
		//singleton = new Singleton(); sadece bir kez olu�turmak i�in if kontrol� yapar�z.
		
		number++;
		System.out.println(number);
		return singleton;
	}

}
