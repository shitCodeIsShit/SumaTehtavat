package tehtava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Kotelo extends LaiteOsa{
	
	protected List<Osa> children = new ArrayList<>();

	public Kotelo(String nimi, double hinta, List<Osa> kotelonOsat) {
		super(nimi, hinta);
		lisaa(kotelonOsat);
	}
	
	public void lisaa(List<Osa> kotelonOsat) {
		children.addAll((Collection<? extends Osa>) Arrays.asList(kotelonOsat));
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
		return super.getHinta();
	}

}
