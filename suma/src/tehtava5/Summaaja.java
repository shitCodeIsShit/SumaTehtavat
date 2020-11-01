package tehtava5;

public class Summaaja {
	
	private static Summaaja instance;
	public int summa;
	
	// Olen privaatti koska en halua näkyä kuin sisälle
	private Summaaja () {
		this.summa = 0;
	}
	
	// Tämä on ainut tapa luoda singleton
	// Jos summaajaa ei ole se luodaan muuten palautetaan jo luotu summaaja
	public static Summaaja getInstance() {
		
		if (instance == null) {
			instance = new Summaaja();
		}
		
		return instance;
	}
	
	// Lisätään lukuun
	public void lisaa(int luku) {
		this.summa += luku;
	}
	
	// Kerrotaan summa
	public int kerroSumma() {
		return this.summa;
	}

}
