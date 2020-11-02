package tehtava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Kotelo implements LaiteOsa{
	
	protected List<Osa> children = new ArrayList<>();
	
	String nimi;
	double hinta;

	public Kotelo(String nimi, double hinta, List<Osa> kotelonOsat) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	public void lisaa(Osa osa) {
		children.addAll((Collection<? extends Osa>) osa);
	}
	
	// Sisältää myös kotelon hinnan
	public double laskeHintaYhteensa() {
		
		double summa = 0;
		
		for(Osa o: children) {
			summa += o.getHinta();
		}
		
		return summa + this.hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
