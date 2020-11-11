package tehtava6;

public class Main {
	
	public static void main(String[] args) {
		
		String tiedostonNimi = "salasana_piilo.txt";
		String salasana = "isojaMursujaLiikenteessa8438";
		
		// Luodaan perus tiedoston lukia
		DataSource source = new FileDataSource(tiedostonNimi);
		
		// Kirjoitetaan salasana tiedostoon
		source.writeData(salasana);
		
		// Salasana on nyt tällähetkellä ilman salausta
		System.out.println("Alkuperäinen salasana: " + source.readData());
		
		// Luodaan decoraattori ja annetaan sille parametrinä source
		// (annetaan sourcelle mahdollisuus pukea takki päälle)
		// Tämä on turha vaihe
		//DataSource dsc = new DataSourceDecorator(source);
		
		// Käytetaan sourcen mahdollisuutta pukea takki päälle
		DataSource ed = new EncryptionDecorator(source);
		ed.writeData(salasana);
		
		// Katsotaan onko tieto muuttunut
		System.out.println("Base64 salattu salasana: " + source.readData());
		
		// Palautetaan tieto alkuperäiseen muotoon
		System.out.println("Encoderilta suoraan: " + ed.readData());
		
		
	}

}
