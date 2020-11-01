package tehtava6;

public class Main {
	
	public static void main(String[] args) {
		
		String tiedostonNimi = "salasana_piilo.txt";
		String salasana = "isojaMursujaLiikenteessa8438";
		
		// Luodaan perus tiedoston lukia
		FileDataSource source = new FileDataSource(tiedostonNimi);
		
		// Kirjoitetaan salasana tiedostoon
		source.writeData(salasana);
		
		// Salasana on nyt tällähetkellä ilman salausta
		System.out.println("Alkuperäinen salasana: " + source.readData());
		
		// Luodaan decoraattori ja annetaan sille parametrinä source
		// (annetaan sourcelle mahdollisuus pukea takki päälle)
		DataSourceDecorator dsc = new DataSourceDecorator(source);
		
		// Käytetaan sourcen mahdollisuutta pukea takki päälle
		EncryptionDecorator ed = new EncryptionDecorator(dsc);
		ed.writeData(salasana);
		
		// Katsotaan onko tieto muuttunut
		System.out.println("Base64 salattu salasana: " + source.readData());
		
		// Palautetaan tieto alkuperäiseen muotoon
		System.out.println("Encoderilta suoraan: " + ed.readData());
		
		
	}

}
