package Char_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//write than read
		
		FileWriter fw = new FileWriter("D://p.txt");
		fw.write("I am file writer");
		
		fw.close();
		
		//Reading from file using file reader
		
		FileReader fr = new FileReader("D://p.txt");
		
		int i;
		
		while((i = fr.read()) != -1) {
			System.out.println((char)i);
			
//			By default it is in byte
			
		}
		fr.close();
		 
	}

}
