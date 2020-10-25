package tehtava2VääräVersio;

public class VaatekaappiAdidas extends Vaatekaappi{
	
	VaatekaappiTehdas vkt;
	
	public VaatekaappiAdidas(VaatekaappiTehdas vaatekaappiTehdas) {
		this.vkt = vaatekaappiTehdas;
	}

	@Override
	void vaatteetKaappiin() {
		System.out.println("lisätään adidas vaatekaappiin adidas vaatteet");
		tpaita = vkt.lisääKaappiinTpaita();
		lippis = vkt.lisääKaappiinLippis();
		farmarit = vkt.lisääKaappiinFarmarit();
	}

}
