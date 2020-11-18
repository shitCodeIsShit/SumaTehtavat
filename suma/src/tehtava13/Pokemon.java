package tehtava13;

public class Pokemon {
	
	private State state;
	
	BonusPisteitaVisitor bpv = new BonusPisteitaVisitor();
	
	private String nimi;
	private int taso;
	
	public Pokemon() {
		// Aloittaa elämänsä Charmanderina mutta myöhemmin kehittyy
		this.state = new Charmander(this);
		this.taso = 1;
		this.nimi = "";
	}
	
	public void kehity(State state) {
		this.state = state;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public void setTaso(int taso) {
		this.taso = taso;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public int getTaso() {
		return taso;
	}
	
	// Joka kerta ku nostetaan tasoa niin käydään bonusvisitorissa
	// ja lisätään oikea määr bisteitä :DDD
	public void nostaTasoa() {
		/*
		System.out.println(this.state.getClass());
		if(state.equals((Charmander) state)) {
			bpv.visitCharmander((Charmander) state);
		}else if(state.equals((Charmeleon) state)) {
			bpv.visitCharmeleon((Charmeleon) state);
		}else if(state.equals((Charizard) state)) {
			bpv.visitCharizard((Charizard)state);
		}
		*/
		this.taso++;
	}

}
