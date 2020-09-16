package file;

import java.io.File;

public class first {

	public static void main(String[] args) {
		File file = new File("C:\\Intel");
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				System.out.println(file2.getName());
			}
			for(int i=0;i<files.length;i++) {
				System.out.println(files[i].getName());
			}
		}

	}

}
