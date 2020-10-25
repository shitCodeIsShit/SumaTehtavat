package tehtava2Mark2OikeaVersio;

public class BossVaateTehdas implements AbstractFactory{

	@Override
	public Tpaita valmistaTpaita() {
		Tpaita bossTpaita = new Tpaita();
		bossTpaita.asetaVaatteenNimi("Boss T-paita");
		return bossTpaita;	}

	@Override
	public Lippis valmistaLippis() {
		Lippis bossLippis = new Lippis();
		bossLippis.asetaVaatteenNimi("Boss Lippis");
		return bossLippis;	}

	@Override
	public Farmarit valmistaFarmarit() {
		Farmarit bossFarmarit = new Farmarit();
		bossFarmarit.asetaVaatteenNimi("Boss Farmarit");
		return bossFarmarit;	}



}
