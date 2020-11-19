package tehtava14;

// PRODUCT aka tuote
public class Hampurilainen {
	
	// Opettaja halusi lista tyypin myös joten tämän luokan voisi laittaa palauttamaan listan
	
	private Sampyla sampyla;
	private Pihvi pihvi;
	private Salaatti salaatti;
	private Kastike kastike;
	private Mausteet mausteet;
	private boolean kurkku;
	private boolean ketsuppi;
	

	public Hampurilainen(Sampyla sampyla, Pihvi pihvi, Salaatti salaatti, Kastike kastike, Mausteet mausteet,
			boolean kurkku, boolean ketsuppi) {
		this.sampyla = sampyla;
		this.pihvi = pihvi;
		this.salaatti = salaatti;
		this.kastike = kastike;
		this.mausteet = mausteet;
		this.kurkku = kurkku;
		this.ketsuppi = ketsuppi;
	}



	public Sampyla getSampyla() {
		return sampyla;
	}

	public Pihvi getPihvi() {
		return pihvi;
	}

	public Salaatti getSalaatti() {
		return salaatti;
	}

	public Kastike getKastike() {
		return kastike;
	}

	public Mausteet getMausteet() {
		return mausteet;
	}

	public boolean isKurkku() {
		return kurkku;
	}

	public boolean isKetsuppi() {
		return ketsuppi;
	}
	
	@Override
	public String toString() {
		
		String kokoHamppari = "";
		
		kokoHamppari ="| Sämpylä: "+ this.sampyla.getLeipa() + " | "
				+ "Pihvi: " + this.pihvi.getPihvi() + " | "
				+ "Salaatti: " + this.salaatti.getSalaattiLaji() + " | "
				+ "Kastike: " + this.kastike.getKastikeLaatu()+ " | "
				+ "Mausteet: " + this.mausteet.getMausteet() + " | "
				+ "ketsuppi: " + this.ketsuppi + " | "
				+ "kurkku: " + this.kurkku + " |";
		
		return kokoHamppari;
	}
	
	

}
