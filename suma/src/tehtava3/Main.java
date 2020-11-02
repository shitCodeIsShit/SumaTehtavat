package tehtava3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// Luodaan ensin laitteen osia
		Osa muisti = new Muisti("", 199.99);
		Osa prosessori = new Prosessori("", 299.99);
		Osa näyttis = new NäytönOhjain("", 523.5);
		Osa verkkokortti = new Verkkokortti("", 123);
		
		List<Osa> emolevynOsat = new ArrayList<>();
		emolevynOsat.add(muisti);
		emolevynOsat.add(prosessori);
		emolevynOsat.add(näyttis);
		emolevynOsat.add(verkkokortti);
		
		Osa emolevy = new Emolevy("", 356);
		emolevy.lisaa(emolevynOsat);
		Osa virtalahde = new Virtalähde("", 287);
		
		List<Osa> kotelonOsat = new ArrayList<>();
		kotelonOsat.add(emolevy);
		kotelonOsat.add(virtalahde);
		
		Osa kotelo = new Kotelo("", 126, kotelonOsat);
		
		System.out.println(kotelo);

	}

}
