package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleFileNotfoundException {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\subash\\Desktop\\name.txt");
		FileReader fr=new FileReader(f1);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.println((char)(temp));
		}
	}

}
