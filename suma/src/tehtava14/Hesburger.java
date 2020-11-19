package tehtava14;

// BUILDER
public class Hesburger implements HampurilaisBuilder{
	
	private Sampyla sampyla;
	private Pihvi pihvi;
	private Salaatti salaatti;
	private Kastike kastike;
	private Mausteet mausteet;
	private boolean kurkku;
	private boolean ketsuppi;
	

	@Override
	public void setSampyla(Sampyla sampyla) {
		this.sampyla = sampyla;
	}

	@Override
	public void setPihvi(Pihvi pihvi) {
		this.pihvi = pihvi;
	}

	@Override
	public void setSalaatti(Salaatti salaatti) {
		this.salaatti = salaatti;
	}

	@Override
	public void setKastike(Kastike kastike) {
		// TODO Auto-generated method stub
		this.kastike = kastike;
	}

	@Override
	public void setMausteet(Mausteet mausteet) {
		this.mausteet = mausteet;
	}

	@Override
	public boolean setKurkku(boolean kurkku) {
		return this.kurkku = kurkku;
	}

	@Override
	public boolean setKetsuppi(boolean ketsuppi) {
		return this.ketsuppi = ketsuppi;
	}
	
	public Hampurilainen getHamppari() {
		return new Hampurilainen(sampyla, pihvi, salaatti, kastike, mausteet, kurkku, ketsuppi);
	}

}
