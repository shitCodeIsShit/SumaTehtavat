package tehtava10;

public class Palkankorotus {
	
	double nykyinenPalkka;
	double korotettuPalkka;
	
	public Palkankorotus(double nykyinenPalkka, double korotettuPalkka) {
		this.nykyinenPalkka = nykyinenPalkka;
		this.korotettuPalkka = korotettuPalkka;
	}

	public double laskePalkankorotusProsentteina() {
		double tulos = ((korotettuPalkka - this.nykyinenPalkka) / this.nykyinenPalkka) * 100;
		return tulos;
	}
}
