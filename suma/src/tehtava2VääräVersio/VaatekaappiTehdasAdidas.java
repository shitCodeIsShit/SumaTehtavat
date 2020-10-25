package tehtava2VääräVersio;

public class VaatekaappiTehdasAdidas implements VaatekaappiTehdas{

	@Override
	public Tpaita lisääKaappiinTpaita() {
		return new AdidasTpaita();
	}

	@Override
	public Lippis lisääKaappiinLippis() {
		return new AdidasLippis();
	}

	@Override
	public Farmarit lisääKaappiinFarmarit() {
		return new AdidasFarmarit();
	}
	
	void vaatteetKaappiin(){
		
		System.out.println("aktivoitui");
		
		lisääKaappiinFarmarit();
		lisääKaappiinLippis();
		lisääKaappiinTpaita();
	}

}
