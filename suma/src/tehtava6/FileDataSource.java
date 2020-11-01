package tehtava6;

import java.io.*;

public class FileDataSource implements DataSource {
	
	private String name;
	
	public FileDataSource(String name) {
		this.name = name;
	}

	@Override
	public void writeData(String data) {
		
		File file = new File(name);
		try {
			OutputStream out = new FileOutputStream(file);
			out.write(data.getBytes(), 0, data.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public String readData() {
		
		char[] buffer = null;
		File file = new File(name);
		
		try {
			
			FileReader reader = new FileReader(file);
			buffer = new char[(int) file.length()];
			reader.read(buffer);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return new String(buffer);
	}

}
