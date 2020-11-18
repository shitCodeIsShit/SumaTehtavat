package tehtava11;

public class Arvaaja {
	
	// kun luodaan arvaaja niin luonnin yhteyden luodaan arvattava nunero
	// johon client ei pääse käsiksi
	ArvattavaNumero an = new ArvattavaNumero();

	public boolean arvaanNumeroa(int arvaus) {
		return Arvuuttaja.arvauksenTulos(an.getM(), arvaus);
	}
	
	// Sisäluokka johon client ei pääse käsiksi
	private static class ArvattavaNumero{
		
		private static Memento m = Arvuuttaja.liityPeliin();
		
		private Memento getM() {
			return m;
		}
		
		
	}

}
