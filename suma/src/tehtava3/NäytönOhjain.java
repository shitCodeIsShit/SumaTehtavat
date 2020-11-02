package tehtava3;

public class NäytönOhjain implements LaiteOsa{

	String nimi;
	double hinta;

	public NäytönOhjain(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		return hinta;
	}

}
