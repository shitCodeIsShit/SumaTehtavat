package tehtava15;

public abstract class Kivi {
	
	// Mineraaleissa käytetty kovuus aste Mohs 1 - 10

	String nimi;
	int mohs;
	
	public Kivi(String nimi, int mohs) {
		this.nimi = nimi;
		this.mohs = mohs;
	}

	public String getNimi() {
		return nimi;
	}
	
	public int getMohs() {
		return mohs;
	}
}
