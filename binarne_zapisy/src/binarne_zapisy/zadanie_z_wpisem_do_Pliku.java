package binarne_zapisy;
import java.io.*;

public class zadanie_z_wpisem_do_Pliku {
	public static void main(String[] args) {
		RandomAccessFile strumien=null;
		int IloscBitow=0;
		try {
			strumien=new RandomAccessFile("DaneBinarne.txt","rw");
		}catch(FileNotFoundException e){
			System.out.println("Strumie siê kurwa nie otwiera, hjuston - mamy problem");
		}
		try {
			strumien.writeInt(22);
			strumien.writeUTF("Tadzini");
			strumien.writeDouble(50/4);
			strumien=new RandomAccessFile("DaneBinarne", "rw");
			while(strumien.read()!=-1) {
				IloscBitow++;
			}
		}catch(IOException e) {
			System.out.println("Problem z wejœciem lub wyjœciem");
		}
		try {
			strumien.close();
		}catch(IOException e) {
			System.out.println("Hjuston, strumien sie nie zamkyka,");
		}
	System.out.println("Ilosc bajtow wynosi: "+IloscBitow);
}}
