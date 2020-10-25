package tehtava2Mark2OikeaVersio;

public class Jasper {
	
	Vaatteet paalla = new Vaatteet();
	
	public void pueVaatteetPäälle(String merkki) {
		
		if(merkki.equals("adidas")) {
			paalla.luoAdidasVaatteet();
		}else if(merkki.equals("boss")) {
			paalla.luoBossVaatteet();
		}else {
			System.out.println("Et antanut järkevää vaate merkkiä");
		}
		
	}
	
	public void kerroMitäPäällä() {
		System.out.println("Mulla on päällä: " + paalla.tiedot());
	}
	

}
