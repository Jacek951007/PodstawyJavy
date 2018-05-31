package binarne_zapisy;
import java.io.*;
public class binarne_odczyty_zapisy {
	public static void main(String[] args) {
		try {
			DataOutputStream strumien=new DataOutputStream(new FileOutputStream("plik.txt"));
			
			strumien.close();
		}catch(FileNotFoundException e) {
			System.out.println("System nie znalazl pliku");
		}catch(IOException e) {
		System.out.println("B³¹d i-o");
		}
		// to jest jedna mozliwosc
		/*DataOutputStream strumien=null;
		try {
			strumien=new DataOutputStream(new FileOutputStream("plik.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku");
		}
		try {
			//dowolne metody			
		}catch (IOException e) {
			System.out.println("Wyj¹tek");
		}
		
		try {
			if(strumien!=null)
				strumien.close();	
		}catch(IOException e) {
			System.out.println("B³¹d zamykania strumienia");
		}*/
	}
}
