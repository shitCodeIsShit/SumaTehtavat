package tehtava10;

public class Handler {
	
	public Chain c1;
	
	public void setUpChain() {
		c1 = new Lahiesimies();
		Chain c2 = new YksikonPaalikko();
		Chain c3 = new Toimitusjohtaja();
		
		c1.setNext(c2);
		c2.setNext(c3);
	}

}
