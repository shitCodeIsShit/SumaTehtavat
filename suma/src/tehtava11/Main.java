package tehtava11;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		// Tänne tulee pelaajien luonti ja peli logiikka
		Scanner scanner = new Scanner(System.in);
		
		Arvaaja a = new Arvaaja();
		
		while(true) {
			System.out.print("Arvaa lukua 1-10 väliltä: ");
			int arvaus = scanner.nextInt();
			
			if(a.arvaanNumeroa(arvaus)) {
				System.out.println("Onneksi olkoo arvasit oikein!");
				break;
			}
			
			System.out.println("Väärin meni koita uudestaan!\n");
			//TODO: asd
			
		}
		
	}

}
