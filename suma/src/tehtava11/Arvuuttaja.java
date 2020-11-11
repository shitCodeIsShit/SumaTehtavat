package tehtava11;

import java.util.Random;

public class Arvuuttaja {

	// Arvuuttaja arpoo numeron ja palauttaa sen mementona

	public static Memento liityPeliin() {
		Random r = new Random();
		// luku 1 - 10 väliltä
		int luku = r.nextInt(10 + 1);
		return new Memento(luku);
	}

	// Tarkistaa onko memento aka talletettu arvaus ja asiakkaan arvaus sama
	public static boolean arvauksenTulos(Memento m, int arvaus) {

		if (m.getArvattava() == arvaus) {
			return true;
		}

		return false;
	}

}
