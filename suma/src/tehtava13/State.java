package tehtava13;

public abstract class State {

	Pokemon pokemon;
	
	State(Pokemon pokemon){
		this.pokemon = pokemon;
	}
	
	/*
	 * Vaihtaa pokemonin statea aka Kehittyy
	 */
	public abstract void kehity();
	
	/*	
	 * Tämä on pokemonin arkista toimintaa kuvaava metodi
	 * tämä laitetaan käyntiin pokemonin luonnin yhteydessä
	 * pokemon kehittyy tietylle tasolle ja sitten vaihtaa statea
	*/
	public abstract void arkiElamaa();
	
	public abstract void accept(Visitor v);
	
}
