package tehtava15;

public class Main {

	public static void main(String[] args) {
		
		Banaani b = new Banaani("Banaani", 2);
		Quartz q = new Quartz("Quartz", 7);
		Kulta k = new Kulta("Kulta", 3);
		
		Tehosekoitin blenderi2000 = new Tehosekoitin();
		
		// Banaani ja Quartzi
		blenderi2000.willItBlend(b, q);
		
		System.out.println("\n------------------------------------\n");
		
		// Banaani ja Kulta
		blenderi2000.willItBlend(b, k);
		
		
	}

}
