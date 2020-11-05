package tehtava7;

public class Charmeleon extends State {



	Charmeleon(Pokemon pokemon) {
		super(pokemon);
		pokemon.setNimi("Charmeleon");
		arkiElamaa();
	}

	@Override
	public void kehity() {
		pokemon.kehity(new Charizard(pokemon));
	}

	@Override
	public void arkiElamaa() {

		System.out.println("Hei olen " + pokemon.getNimi() + " ja jatkan elämääni!");

		// Loputon looppi kunnes kehitys
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

			// Statementti jolla päästään pois arkielämästä
			if (pokemon.getTaso() == 10) {
				System.out.println("Olen tarpeeksi isotasoinen kehittymään!");
				System.out.println();
				this.kehity();
				break;
			}

		}

	}

}
