package tehtava3;

public class Muisti implements LaiteOsa{
	
	String nimi;
	double hinta;

	public Muisti(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	@Override
	public double getHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

}
