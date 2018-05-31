import java.util.Random;
import java.util.Scanner;


public class Gierka {
	public static void main(String[] args) {
		Random losuj = new Random();
		Scanner odczyt = new Scanner(System.in);
		String[] mozliweWybory = {"Kamien", "Papier", "Nozyce"};
		String wyborGracza = "";
		int decyzjaKomputera = losuj.nextInt(mozliweWybory.length);
		String wyborKomputera;
		String gra;
		int decyzjaGracza;
		
		do{
			System.out.println("Wybierz czy chcesz 1(Kamieñ), 2(Paipier), 3(No¿yce)");
			decyzjaGracza = odczyt.nextInt();		
			
			
			switch(decyzjaGracza) {
			case 1: wyborGracza = mozliweWybory[0];
				break;
			case 2: wyborGracza = mozliweWybory[1];
				break;
			case 3: wyborGracza = mozliweWybory[2];
				break;
			default: System.out.println("Nie wybra³eœ ¿adnej akcji, wiêc domyœlnie dostajesz kamieñ");
				wyborGracza = mozliweWybory[0];
			break;
			}
			
			if(decyzjaKomputera == 0) {
				wyborKomputera = "Kamien";
			}
			else if(decyzjaKomputera == 1){
				wyborKomputera = "Papier";		
			}
			else {
				wyborKomputera = "Nozyce";
			}
			
			System.out.println("Ty wybra³es "+wyborGracza+", a Komputer "+wyborKomputera);
			
			if(wyborGracza == wyborKomputera) {
				System.out.println("Mamy remisik");
			}
			else if( wyborGracza == "Kamien" && wyborKomputera == "Papier") {
				System.out.println("Przegrales");
			}
			else if(wyborGracza == "Kamien" && wyborKomputera == "Nozyce") {
				System.out.println("Wygra³eœ");
			}
			else if(wyborGracza == "Papier" && wyborKomputera == "Nozyce") {
				System.out.println("Przegrales");
			}
			else if(wyborGracza == "Nozyce" && wyborKomputera == "Papier") {
				System.out.println("Wygrales");
			}
			else if(wyborGracza == "Papier" && wyborKomputera == "Kamien") {
				System.out.println("Wygra³eœ");
			}
			else if(wyborGracza == "Nozyce" && wyborKomputera == "Kamien") {
				System.out.println("Przegrales");
			}
			System.out.println("czy chcesz zagraæ jeszcze raz(Y/N)");
			gra = odczyt.next();
			
		}while(gra=="n");
	
	
	odczyt.close();
	}
}
