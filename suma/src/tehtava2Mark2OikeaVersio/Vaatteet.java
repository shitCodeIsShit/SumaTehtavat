package tehtava2Mark2OikeaVersio;

public class Vaatteet {
	
	Tpaita tpaita;
	Lippis lippis;
	Farmarit farmarit;
	
	public void luoAdidasVaatteet() {
		AdidasVaateTehdas adidasTehdas = new AdidasVaateTehdas();
		tpaita = adidasTehdas.valmistaTpaita();
		lippis = adidasTehdas.valmistaLippis();
		farmarit = adidasTehdas.valmistaFarmarit();
	}

	public void luoBossVaatteet() {
		BossVaateTehdas bossTehdas = new BossVaateTehdas();
		tpaita = bossTehdas.valmistaTpaita();
		lippis = bossTehdas.valmistaLippis();
		farmarit = bossTehdas.valmistaFarmarit();
	}
	
	public String tiedot() {
		return tpaita.palautaVaatteenNimi() + ", " + lippis.palautaVaatteenNimi() + ", " + farmarit.palautaVaatteenNimi();
	}
}
