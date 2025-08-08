package labsession._01_08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStudentToFile {

	public static void main(String[] args) throws IOException {
  
		 BufferedWriter writer = new BufferedWriter(new FileWriter("D://filewrite.txt"));
	
	
		  writer.write("101, John Doe\n");
	        writer.write("102, Alice Smith\n");
	        writer.write("103, Raj Patel\n");

	        writer.close();
	        System.out.println("Student list written to file.");
	
	}

}
