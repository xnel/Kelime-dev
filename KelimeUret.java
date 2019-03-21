package odev;

import java.util.Random;
import java.util.Scanner;

public class KelimeUret {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Kelime kac karakterli olacak?");

		int kacKarakter = input.nextInt();

		System.out.println("Kac tane kelime olusturulacak?");

		int kacKelime = input.nextInt();
		

		Random rand = new Random(26);
		

		char[] alfabe = new char[26]; // karakterleri tutacak olan array tanımlandı.
		
		for (char ch = 'A'; ch <= 'Z'; ++ch) 
		{
			alfabe[ch - 'A'] = ch; // alfabe dizisi harflerle dolduruldu.
		}

		System.out.println(alfabe); // alfabe yazdırıldı.
		
		

		for (int i = 1; i <= kacKelime; i++) {
			System.out.println();
			
			for (int k = 1; k <= kacKarakter; k++) {

				int x = rand.nextInt(26);
				System.out.print(alfabe[x]);
				
				//kelimeler[kacKelime] = alfabe[x];
			}

		}
		
		
		
		

	}

}