package tehtava9;

import java.util.Iterator;
import java.util.List;

/*
 * Tämä luokka käy sille annetun listan läpi Iteraattorin avulla
 * palauttaa stringin jossa on rivin vaihto jokaisen sanan kohdalla
 * */

public class LineBrakeStrategyEveryone implements ListConverter{
	
	Iterator<String> stringiIteraattori;

	@Override
	public String listToString(List<String> lista) {
		
		String palautettava = "";
		
		stringiIteraattori = lista.iterator();
		
		while (stringiIteraattori.hasNext()) {
			palautettava += ((String) stringiIteraattori.next()) + "\n";
			
		}
		
		return palautettava;
	}

}
