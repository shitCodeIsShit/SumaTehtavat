package tehtava9;

import java.util.List;

/*
 * Tämä on luokka joka hallitsee kaikkia strategioita
 * käsittelee niitä vaan rajapinnan kautta. Tällä tavoin 
 * voidaan vaihtaa strategiaa suorituksen aikana.
 * */

public class LineBrakeStrategy {
	
	ListConverter lc;
	
	public void setStrategy(ListConverter strategy) {
		this.lc = strategy;
	}
	
	public String executeStrategy(List<String> lista) {
		return lc.listToString(lista);
	}

}
