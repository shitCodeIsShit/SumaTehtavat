package tehtava8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KPS extends Game {

	// Pari perus muuttujaa
	private boolean endOfGame = false;
	private int voittaja;

	// Pari erikoisempaa muttujaa
	HashMap<Integer, String> valinnat = new HashMap<Integer, String>();
	Scanner scanner = new Scanner(System.in);

	@Override
	void initializeGame() {
		System.out.println("Terveluloa pelaamaan kivi, sakset, paperia!");
		System.out.println("Valitse joko K, S tai P");
	}

	@Override
	void makePlay(int player) {

		System.out.print("K, P vai S = ");
		String valinta = scanner.nextLine();

		// Laitetaan pelaajan valinta valinnat hasmappiin
		valinnat.put(player, valinta);
		System.out.println(valinnat.get(0));
		// Aloitetaan käymään läpi pelaajien valintoja
		// Jos lista on isompi kuin 1 on jotain läpi käytävää
		if (valinnat.size() > 1) {

			// Tuliko tasapeli?
			if (valinnat.get(0).equals(valinnat.get(1))) {
				System.out.println("Tuli tasapeli! Ei voittajaa!");
				// Clearataan uutta peliä varten
				valinnat.clear();
			} else {

				// KIVI VS SAKSET
				if (valinnat.get(0).equals("K") && valinnat.get(1).equals("S")) {
					voittaja = 1;
					endOfGame = true;
				} else if (valinnat.get(1).equals("S") && valinnat.get(1).equals("K")) {
					voittaja = 2;
					endOfGame = true;
				}

				// SAKSET VS PAPERI
				if (valinnat.get(0).equals("S") && valinnat.get(1).equals("P")) {
					voittaja = 1;
					endOfGame = true;
				} else if (valinnat.get(0).equals("P") && valinnat.get(1).equals("S")) {
					voittaja = 2;
					endOfGame = true;
				}

				// PAPERI VS KIVI
				if (valinnat.get(0).equals("P") && valinnat.get(1).equals("K")) {
					voittaja = 1;
					endOfGame = true;
				} else if (valinnat.get(0).equals("K") && valinnat.get(1).equals("P")) {
					voittaja = 2;
					endOfGame = true;
				}

				// Clearataan taas
				valinnat.clear();
			}
		}

	}

	@Override
	boolean endOfGame() {
		return endOfGame;
	}

	@Override
	void printWinner() {
		System.out.println("VOITAJA ON " + voittaja + " PELAAJA!");
	}

}
