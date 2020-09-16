package xiawu;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
		int n = 0;
		try {
			FileWriter writer = new FileWriter("D:\\Push\\1111.txt");
			writer.write("£¿£¿£¿£¿£¿£¿£¿");
			writer.flush();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
