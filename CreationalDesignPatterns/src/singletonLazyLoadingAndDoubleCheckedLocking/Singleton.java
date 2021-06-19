package singletonLazyLoadingAndDoubleCheckedLocking;


public class Singleton {
	
	private static Singleton singleton;
	
	private static int number = 0;
	
	private Singleton() {
		System.out.println("I was created");
	}
	
	
	public static Singleton getSingleton() {
		
		//synchronizde metodunun çok yavaþ çalýþmasýný önlemek için >>>>>>if(singleton == null) kontrolü getirilir.
		// bu tip iç içe null kontrolünün adý <<>>>>>>>>>>>double checked locking denir
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
		//yapýlan if kontrolü multithread çalýþýnca sistemde açýk verir. bunun için yukarýdaki synchronized komutlarý yazýlýr.
		 * fakat bunu yapýnca metodun çalýþmasýný ciddi bir þekilde yavaþlatýr. çünkü bu sözcük ile (synchronized) karþýlasýnca metodlar kuyruða girer.
		 
		*/
		
		//singleton = new Singleton(); sadece bir kez oluþturmak için if kontrolü yaparýz.
		
		number++;
		System.out.println(number);
		return singleton;
	}

}
