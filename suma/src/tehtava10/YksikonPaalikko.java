package tehtava10;

public class YksikonPaalikko implements Chain {

	private Chain chain;

	@Override
	public void setNext(Chain c) {
		this.chain = c;
	}

	@Override
	public void saakoAntaaPalkonKorotuksen(Palkankorotus k) {

		double v = k.laskePalkankorotusProsentteina();

		if (v > 2 && v <= 5) {
			this.kerroPalkanKorotuksesta();
			System.out.println("Palkan korotus prosentteina: "+k.laskePalkankorotusProsentteina() + "%");
		}else {
			chain.saakoAntaaPalkonKorotuksen(k);
		}

		

	}

	public void kerroPalkanKorotuksesta() {
		System.out.println("Onneksi olkoon! " + "Palkkasi nousi! " + "Sen antoi: Yksikönpäällikkö");

	}

}
