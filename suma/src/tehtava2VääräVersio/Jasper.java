package tehtava2VääräVersio;

public class Jasper {
	
	Vaatekaappi jasperinVaatekaappi = null;
	
	public void haluanVaatekaapin(String merkki) {
		VaatekaapinValmistus jasperinVaatekaappi = new VaatekaapinValmistaja();
		jasperinVaatekaappi.valmistaVaatekaappi(merkki);
	}
	
	public void jasperinVaatekaapinSisältö() {
		System.out.println("Kaapissa on: ");
		System.out.println(jasperinVaatekaappi.toString());
	}

}
