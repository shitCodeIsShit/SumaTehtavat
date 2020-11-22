package tehtava15;

public class Tehosekoitin {
	
	// Pystyn plendaamaan kaikki kivet jotka on > 4
	// Pystyn plendaamaan kaikki hedelmät jotka on > 9
	
	// TÄMÄ TEHOSEKOITIN SEKOITTAA HEDELMIÄ JA KIVIÄ KESKENÄÄN 
	// Ei tarkoitettu oikeaan käyttöön
	
	public void willItBlend(Hedelma h, Kivi k) {
		System.out.println("Will it blend? That is the question! \n");
		// Katsotaan että blendaantuuko hedelmä
		// Jos true siirytään kiveen
		if(h.getMohs() < 9) {
			System.out.println(h.getNimi() + " IT WILL BLEND! ZURRRRRRRRRRRRRRRR!");
			
			// Katsotaan blendaantuunko Kivi
			if(k.getMohs() < 4) {
				System.out.println("THE MINERAL " + k.getNimi() + " WILL ALSO BLEND! ZURRRRRRRRRRRR!");
			}else {
				System.out.println("YOU BROKE THE BLENDER WITH_: " + k.getNimi());
			}
			
		}else {
			System.out.println("YOU BROKE THE BLENDER WITH_: " + h.getNimi());
		}
		

		
	}

}
