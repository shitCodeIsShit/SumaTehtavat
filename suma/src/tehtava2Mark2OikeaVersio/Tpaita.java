package tehtava2Mark2OikeaVersio;

public class Tpaita implements Vaate{
	
	String nimi;

	@Override
	public String palautaVaatteenNimi() {
		return nimi;
	}

	@Override
	public void asetaVaatteenNimi(String nimi) {
		this.nimi = nimi;
	}

}
