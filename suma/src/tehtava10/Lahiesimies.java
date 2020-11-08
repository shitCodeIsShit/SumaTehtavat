package tehtava10;

public class Lahiesimies implements Chain {

	private Chain chain;

	@Override
	public void setNext(Chain c) {
		this.chain = c;
	}

	@Override
	public void saakoAntaaPalkonKorotuksen(Palkankorotus k) {

		if (k.laskePalkankorotusProsentteina() <= 2) {
			this.kerroPalkanKorotuksesta();
			System.out.println("Palkan korotus prosentteina: "+k.laskePalkankorotusProsentteina() + "%");
		}else {
			this.chain.saakoAntaaPalkonKorotuksen(k);
		}

		
	}

	public void kerroPalkanKorotuksesta() {
		System.out.println("Onneksi olkoon! " + "Palkkasi nousi! " + "Sen antoi: Lähiesimies");
	}

}
