package tehtava3;

public class LaiteOsa implements Osa{
	
	public String nimi;
	public double hinta;
	
	public LaiteOsa(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return this.hinta;
	}

}
