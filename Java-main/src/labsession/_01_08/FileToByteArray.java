package labsession._01_08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {

	public static void main(String[] args) throws IOException {
	File file = new File("D://a.txt");
	
	byte[] byteArray = new byte[(int) file.length()];
	
	FileInputStream fis = new FileInputStream(file);
	
	fis.read(byteArray);
	fis.close();
	
	//print the contents as a string
	System.out.println(new String(byteArray));
	
	//in byte array format 
	System.out.println((byteArray));

	}

}
