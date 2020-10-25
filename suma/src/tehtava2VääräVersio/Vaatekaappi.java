package tehtava2VääräVersio;

public abstract class Vaatekaappi {
	
	Tpaita tpaita;
	Lippis lippis;
	Farmarit farmarit;
	
	abstract void vaatteetKaappiin();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String info = tpaita.toString() + lippis.toString() + farmarit.toString();
		
		return info;
	}
	

}
