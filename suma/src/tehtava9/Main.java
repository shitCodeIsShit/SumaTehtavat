package tehtava9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> kauppaLista = new ArrayList<String>();
		kauppaLista.add("Banaanit");
		kauppaLista.add("Voi");
		kauppaLista.add("Maito");
		kauppaLista.add("Suklaa");
		kauppaLista.add("Kukkia");
		kauppaLista.add("Höylä");
		kauppaLista.add("Salaatti");
		kauppaLista.add("Jukkapalmu");
		kauppaLista.add("Post-it lappuja");
		kauppaLista.add("Vyö");
		kauppaLista.add("Jauhoja");
		
		// Context luokka joka hallitsee kaikkia eri strategioita
		LineBrakeStrategy lbs = new LineBrakeStrategy();
		
		// Rivin vaihto setit jokaiselle
		lbs.setStrategy(new LineBrakeStrategyEveryone());
		System.out.println(LineBrakeStrategyEveryone.class);
		System.out.println(lbs.executeStrategy(kauppaLista));
		
		// Rivin vaihto setit joka toiselle
		lbs.setStrategy(new LineBrakeStrategyEveryOther());
		System.out.println(LineBrakeStrategyEveryOther.class);
		System.out.println(lbs.executeStrategy(kauppaLista));
		
		// Rivin vaihto setit joka kolmannelle
		lbs.setStrategy(new LineBrakeStrategyEveryThird());
		System.out.println( LineBrakeStrategyEveryThird.class );
		System.out.println( lbs.executeStrategy(kauppaLista) );
		
	}

}
