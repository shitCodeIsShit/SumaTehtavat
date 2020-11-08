package tehtava10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Anna nykuinen palkka: ");
		double palkkaNykyinen = scanner.nextDouble();
		
		System.out.println("Anna palkka korotus: ");
		double toivePalkka = scanner.nextDouble();
		
		scanner.close();
		
		Palkankorotus palkankortus = new Palkankorotus(palkkaNykyinen, toivePalkka);
		
		// Tehdään ketju esimiehistä missä jokainen esimies tarkistaa voiko hän antaa palkan
		Handler h = new Handler();
		h.setUpChain();
		
		// Annetaan ketjussa ensimmäisenä seisovalle arvo
		h.c1.saakoAntaaPalkonKorotuksen(palkankortus);

	}

}
