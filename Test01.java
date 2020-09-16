package xiawu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		FileReader reader = null;
		BufferedReader breader = null;
		try {
			reader = new FileReader("D:\\Push\\1111.txt");
			breader = new BufferedReader(reader);
			String temp = "";
			while ((temp = breader.readLine()) != null) {
				System.out.println(temp);
				count++;
			}
			System.out.println("¹²Ñ­»·" + count + "´Î");
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				breader.close();
				reader.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
