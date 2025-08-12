package Char_Streams;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderWriterEx {

	
	 public static void main(String[] args) throws IOException {

	        // Write data to character array
	        CharArrayWriter caw = new CharArrayWriter();
	        caw.write("I am using CharArrayReader and CharArrayWriter.");
	        char[] content = caw.toCharArray();

	        // Read data from character array
	        CharArrayReader car = new CharArrayReader(content);
	        int ch;
	        while ((ch = car.read()) != -1) {
	            System.out.print((char) ch);
	        }

	        car.close();
	        caw.close();
	 }
}
