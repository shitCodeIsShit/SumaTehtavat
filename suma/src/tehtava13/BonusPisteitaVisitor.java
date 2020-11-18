package tehtava13;

public class BonusPisteitaVisitor implements Visitor{
	
	// Tänne tulee pokemonin oma henk koht bonus
	// Pitäiskö sitä päivitystä pitää yllä täällä ?
	
	private int bonusPisteet = 0;

	@Override
	public void visitCharmander(Charmander cman) {
		this.bonusPisteet += 20;
		System.out.println("BONAREITA: " + this.bonusPisteet);
	}

	@Override
	public void visitCharmeleon(Charmeleon cmel) {
		this.bonusPisteet += 40;
		System.out.println("BONAREITA: " + this.bonusPisteet);
	}

	@Override
	public void visitCharizard(Charizard czard) {
		this.bonusPisteet += 60;
		System.out.println("BONAREITA: " + this.bonusPisteet);
	}
	

}
