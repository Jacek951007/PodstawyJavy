
public class Rodzina {
	public static void main(String[] args) {
		Dziadkowie dziady = new Dziadkowie("Czarne","Czarne",120);
		System.out.println("Dziadkowie: "+dziady.wlosy+", "+dziady.oczy+", "+dziady.inteligencja);
		
		Rodzice starzy = new Rodzice();
		starzy.wlosy="Bia³e";
		starzy.oczy="Bia³e";
		starzy.inteligencja=140;
		starzy.wzrost=180;
		System.out.println("Rodzice: "+starzy.wlosy+", "+starzy.oczy+", "+starzy.inteligencja+", "+starzy.wzrost);
		
		Dzieci mlodzi = new Dzieci();
		mlodzi.wlosy="Blond";
		mlodzi.oczy="Niebieskie";
		mlodzi.inteligencja=160;
		mlodzi.wzrost=185;
		mlodzi.sila=25;
		System.out.println("Dzieci: "+mlodzi.wlosy+", "+mlodzi.oczy+", "+mlodzi.inteligencja+", "+mlodzi.wzrost+", "+mlodzi.sila);
		
	}

}
