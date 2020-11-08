package tehtava10;

public class Toimitusjohtaja implements Chain {

	private Chain chain;

	@Override
	public void setNext(Chain c) {
		this.chain = c;
	}

	@Override
	public void saakoAntaaPalkonKorotuksen(Palkankorotus k) {

		double v = k.laskePalkankorotusProsentteina();

		if (v > 5) {
			this.kerroPalkanKorotuksesta();
			System.out.println("Palkan korotus prosentteina: "+k.laskePalkankorotusProsentteina() + "%");
		}

		
	}

	public void kerroPalkanKorotuksesta() {
		System.out.println("Onneksi olkoon! " + "Palkkasi nousi! " + "Sen antoi: Toimitusjohtaja");

	}

}
