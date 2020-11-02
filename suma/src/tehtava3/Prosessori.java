package tehtava3;

public class Prosessori implements LaiteOsa{

	String nimi;
	double hinta;

	public Prosessori(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
