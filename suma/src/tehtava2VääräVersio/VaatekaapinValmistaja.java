package tehtava2VääräVersio;

public class VaatekaapinValmistaja extends VaatekaapinValmistus{

	@Override
	protected Vaatekaappi valmistaVaatekaappi(String merkki) {
		
		Vaatekaappi vaatekaappi = null;
		
		if(merkki.equals("adidas")) {
			
			VaatekaappiTehdas adidasTehdas = new VaatekaappiTehdasAdidas();
			vaatekaappi = new VaatekaappiAdidas(adidasTehdas);
			//System.out.println(vaatekaappi.toString());
			vaatekaappi.vaatteetKaappiin();
			return vaatekaappi;
			
		}else if(merkki.equals("boss")) {
			
			VaatekaappiTehdas bossTehdas = new VaatekaappiTehdasBoss();
			vaatekaappi = new VaatekaappiBoss(bossTehdas);
			vaatekaappi.vaatteetKaappiin();
			return vaatekaappi;
		}
		
		return null;
	}

}
