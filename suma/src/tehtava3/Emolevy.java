package tehtava3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Emolevy implements LaiteOsa{
	
	protected List<Osa> children = new ArrayList<>();
	
	String nimi;
	double hinta;

	public Emolevy(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	public void lisaa(List<Osa> cpuOsat) {
		children.addAll(cpuOsat);
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
