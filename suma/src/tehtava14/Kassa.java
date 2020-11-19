package tehtava14;

// DIRECTOR aka tirehtööri xD
public class Kassa {
	
	public void luoHesburgerHamppari(HampurilaisBuilder hb) {
		hb.setSampyla(new Sampyla("Pehmeä hesen sämpylä"));
		hb.setPihvi(new Pihvi("Nautaa"));
		hb.setSalaatti(new Salaatti("Jäävuori"));
		hb.setKastike(new Kastike("Hesen kastike"));
		hb.setMausteet(new Mausteet("Pippuri, Suola, Grillimauste"));
		hb.setKetsuppi(true);
		hb.setKurkku(false);
	}
	
	public void luoMcDonaldsHamppari(HampurilaisBuilder hb) {
		hb.setSampyla(new Sampyla("Pehmeä mäkkärin sämpylä"));
		hb.setPihvi(new Pihvi("Possua"));
		hb.setSalaatti(new Salaatti("Pompei"));
		hb.setKastike(new Kastike("Mäkkärin kastike"));
		hb.setMausteet(new Mausteet("Pippuri, Suola"));
		hb.setKetsuppi(true);
		hb.setKurkku(false);
	}
	
	// KURKKU EI KUULU HAMPPARIIN!

}
