package tehtava13;

public class Charizard extends State {

	Charizard(Pokemon pokemon) {
		super(pokemon);
		pokemon.setNimi("Charizard");
		this.arkiElamaa();
	}

	@Override
	public void kehity() {
	}

	@Override
	public void arkiElamaa() {
		System.out.println("Hei olen " + pokemon.getNimi() + " kehityin viimmeiselle kehitys asteelle!");
		System.out.println("Jatkan silti arkeani eteenpäin!");

		// Loputon looppi ei kihity enää
		while (true) {

			// Satunnainen aika aina enen tason nousua
			int aikaEnenTasoa = (int) (Math.random() * (5_000 - 3_000 + 1) + 3_000);

			try {
				Thread.sleep(aikaEnenTasoa);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Nostetaan tasoa yhdellä ylös
			pokemon.nostaTasoa();
			System.out.println("Kehityin tason ylöspäin olen nyt " + pokemon.getTaso());
			
			if(pokemon.getTaso() == 100) {
				System.out.println("Tasoni on 100! Liian voimakas tähän maailmaan lopetetaan ohjelma!");
				break;
			}

		}

	}

	@Override
	public void accept(Visitor v) {
		v.visitCharizard(this);
	}

}
