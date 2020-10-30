package tehtava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Emolevy extends LaiteOsa{
	
	protected List<Osa> children = new ArrayList<>();

	public Emolevy(String nimi, double hinta, List<Osa> osat) {
		super(nimi, hinta);
		lisaa(osat);
	}
	
	public void lisaa(List<Osa> osat) {
		children.addAll((Collection<? extends Osa>) Arrays.asList(osat));
	}
	
	@Override
	public double getHinta() {
		return super.getHinta();
	}

}
