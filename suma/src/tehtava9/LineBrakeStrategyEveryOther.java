package tehtava9;

import java.util.List;

/*
 * Tämä luokka muuttaa sille annetun lista taulukoksi ja käysen läpi
 * tulostaen joka toisen arvon väliin rivin vaihdon
 * */

public class LineBrakeStrategyEveryOther implements ListConverter{

	@Override
	public String listToString(List<String> lista) {

		String palautettava = "";
		
		// Lista taulukoksi
		String[] taulukko = lista.toArray(new String[0]);
		
		// Käydään taulukko läpi forLoopilla
		for(int i = 1; i < taulukko.length; i++) {
			
			if(i % 2 == 0) {
				palautettava += taulukko[i] + "\n";
			}else {
				palautettava += taulukko[i] + ", ";
			}
		}
		
		return palautettava;
	}

}
