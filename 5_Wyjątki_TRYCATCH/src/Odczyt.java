import java.util.*;
public class Odczyt {
	public static void main(String[] args) {
		int tab[] = {1,2,3,4,5};
		Scanner odczyt = new Scanner(System.in);
		int index = -1;
		System.out.println("Podaj numer który chcesz zobaczyæ: ");
		index = odczyt.nextInt();
		try {
		System.out.println(tab[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maksymalny rozmiar tablicy to:"+tab.length);
		}
	}
}
