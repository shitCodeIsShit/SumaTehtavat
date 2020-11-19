package tehtava14;

public interface HampurilaisBuilder {
	
	// Mitkä ovat tavallisia hampurilaiseen liittyviä
	// rakennus ohjeita
	
	// sämpylä
	public void setSampyla(Sampyla sampyla);
	
	// pihvi
	public void setPihvi(Pihvi pihvi);
	
	// salaatti
	public void setSalaatti(Salaatti salaatti);
	
	// kastike
	public void setKastike(Kastike kastike);
	
	// mausteet
	public void setMausteet(Mausteet mausteet);
	
	// kurkku
	public boolean setKurkku(boolean kurkku);
	
	// ketsuppi
	public boolean setKetsuppi(boolean ketsuppi);

}
