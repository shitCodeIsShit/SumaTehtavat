package tehtava15;

public abstract class Hedelma {
	
	// Oma päästä keksitty kovuus asteikko 1 - 5
	
	String nimi;
	int kovuus;
	
	public Hedelma(String nimi, int kovuus) {
		this.nimi = nimi;
		this.kovuus = kovuus;
	}

	public String getNimi() {
		return nimi;
	}
	
	public int getMohs() {
		return kovuus;
	}
	
}
