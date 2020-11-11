package tehtava11;

public class Arvaaja {
	
	// arvaaja on asiakas ja kun se luodaan niin arvuuttaja palauttaa sille memento 
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
