package tehtava6;

public class DataSourceDecorator implements DataSource{
	
	private DataSource DStoWrapped;
	
	public DataSourceDecorator(DataSource source) {
		this.DStoWrapped = source;
	}

	@Override
	public void writeData(String data) {
		DStoWrapped.writeData(data);
	}

	@Override
	public String readData() {
		return DStoWrapped.readData();
	}

}
