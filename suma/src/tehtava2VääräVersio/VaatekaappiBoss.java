package tehtava2VääräVersio;

public class VaatekaappiBoss extends Vaatekaappi{
	
	VaatekaappiTehdas vkt;
	
	public VaatekaappiBoss (VaatekaappiTehdas vaatekaappitehdas) {
		this.vkt = vaatekaappitehdas;
	}

	@Override
	void vaatteetKaappiin() {
		System.out.println("Lisätään bossin vaatteet bossin kaappiin");
		
	}

}
