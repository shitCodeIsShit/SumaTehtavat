package tehtava2Mark2OikeaVersio;

public class AdidasVaateTehdas implements AbstractFactory{


	@Override
	public Tpaita valmistaTpaita() {
		Tpaita adidasTpaita = new Tpaita();
		adidasTpaita.asetaVaatteenNimi("Adidas T-paita");
		return adidasTpaita;
	}

	@Override
	public Lippis valmistaLippis() {
		Lippis adidasLippis = new Lippis();
		adidasLippis.asetaVaatteenNimi("Adidas Lippis");
		return adidasLippis;
	}

	@Override
	public Farmarit valmistaFarmarit() {
		Farmarit adidasFarmarit = new Farmarit();
		adidasFarmarit.asetaVaatteenNimi("Adidas Farmarit");
		return adidasFarmarit;
	}
	

}
