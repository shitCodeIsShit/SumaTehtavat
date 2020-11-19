package tehtava14;

public class Main {
	
	public static void main(String[] args) {
		
		// Director
		Kassa kassa = new Kassa();
		
		// HESEN SETIT (haluuttiin objektina
		Hesburger hesburgerinHampurilaisBuilder = new Hesburger();
		
		kassa.luoHesburgerHamppari(hesburgerinHampurilaisBuilder);
		Hampurilainen heseHamppari = hesburgerinHampurilaisBuilder.getHamppari();
		
		System.out.println(heseHamppari.getSampyla().getLeipa());
		
		// MCDONALDSIN SETIT haluuttiin stringinä
		McDonalds mcDonaldsHampurilaiseBuilder = new McDonalds();
		
		kassa.luoMcDonaldsHamppari(mcDonaldsHampurilaiseBuilder);
		String mcHamppari = mcDonaldsHampurilaiseBuilder.getHamppari();
		
		System.out.println(mcHamppari);
		
	}

}
