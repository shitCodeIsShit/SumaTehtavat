package tehtava13;


public class Charmander extends State {

	Charmander(Pokemon pokemon) {
		super(pokemon);
		pokemon.setTaso(1);
		pokemon.setNimi("Charmander");
		arkiElamaa();
	}

	@Override
	public void kehity() {
		pokemon.kehity(new Charmeleon(pokemon));
	}
	
	public void charmanderinTemppu() {
		System.out.println("Joku temppu jonka vain Charmander osaa!");
	}


	@Override
	public void arkiElamaa() {
		
		System.out.println("Hei olen " + pokemon.getNimi() + " ja aloitan elämäni!");
		System.out.println("Aloitus tasoni on " + pokemon.getTaso());
		
		this.charmanderinTemppu();
		
		// Loputon looppi kunnes kehitys
		while (true) {
			
			// Satunnainen aika aina enen tason nousua
			int aikaEnenTasoa = (int)(Math.random()*(5_000 - 3_000 + 1) + 3_000);
			
			try {
				Thread.sleep(aikaEnenTasoa);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			pokemon.nostaTasoa();
			System.out.println("Nousin yhden tason ylöspäin olen nyt " + pokemon.getTaso());
			
			pokemon.bpv.visitCharmander(pokemon.getBpv());
			
			
			
			// Statementti jolla päästään pois arkielämästä
			if(pokemon.getTaso() == 5) {
				System.out.println("Olen tarpeeksi isotasoinen kehittymään!");
				System.out.println();
				this.kehity();
				break;
			}
			
		}
		

	}

	@Override
	public void accept(Visitor v) {
		v.visitCharmander(this);
	}


}
