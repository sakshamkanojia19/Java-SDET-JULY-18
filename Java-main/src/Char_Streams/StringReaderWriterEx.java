package Char_Streams;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {

	 public static void main(String[] args) throws IOException {

	    // String writer to the console
		 
		 StringWriter writer = new StringWriter();
		 writer.write("Hello from StringWriter!");
		 String result = writer.toString();
		 System.out.println(result);
	    }
	
	
}
