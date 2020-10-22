package tehtava1;

public class Alumni extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Koskenkorva();
	}

}
