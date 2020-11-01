package tehtava5;

public class Main {

	public static void main(String[] args) {
		
		// Luodaan singeleton
		Summaaja summaaja1 = Summaaja.getInstance();
		
		// Luodaan toinen isntanssi singelotinista
		Summaaja summaaja2 = Summaaja.getInstance();
		
		// Operaatioita moelemmilla
		summaaja1.lisaa(100);
		summaaja2.lisaa(245);
		
		// Lopputulos
		System.out.println("Summaaja1 on sama kuin summaaja2 ja yhteis tulos on: " + summaaja1.summa);

	}

}
