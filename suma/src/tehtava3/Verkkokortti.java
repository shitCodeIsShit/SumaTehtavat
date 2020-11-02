package tehtava3;

public class Verkkokortti implements LaiteOsa{

	String nimi;
	double hinta;

	public Verkkokortti(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
