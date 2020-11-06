package tehtava9;

import java.util.List;

/*
 * Tämä luokka käy listan läpi ja tulostaa joka kolmannen
 * sanan väliin rivin vaihdon 
 * */

public class LineBrakeStrategyEveryThird implements ListConverter{

	@Override
	public String listToString(List<String> lista) {

		String palautettava = "";
		
		for (int i = 1; i < lista.size(); i++) {
			
			if(i % 3 == 0) {
				palautettava += lista.get(i) + "\n";
			}else {
				palautettava += lista.get(i) + ", ";
			}
		}
		
		
		return palautettava;
	}

}
