package tehtava10;

public interface Chain {
	
	// Tämä metodi ketjuttaa luokat rajaninnan kautta
	// asettaa aina seururaavan ketjussa
	public void setNext(Chain c);
	
	// Jos saatu palkan korotus on tiettyissä rajoissa tulostaa asian
	// jos ei niin antaa sen seuraavalle ketjussa.
	public void saakoAntaaPalkonKorotuksen(Palkankorotus k);

}
