package tehtava3;

public class Virtalähde implements LaiteOsa{

	String nimi;
	double hinta;

	public Virtalähde(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
