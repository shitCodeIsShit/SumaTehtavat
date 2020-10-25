package tehtava2Mark2OikeaVersio;

public class Lippis implements Vaate{
	
	String nimi;

	@Override
	public void asetaVaatteenNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public String palautaVaatteenNimi() {
		return nimi;
	}

}
