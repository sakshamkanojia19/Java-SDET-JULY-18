package labsession._01_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentsFromFile {

	 public static void main(String[] args) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader("D://filewrite.txt"));

	        String line;
	        System.out.println("Student List:");
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 2) {
	                String id = parts[0].trim();
	                String name = parts[1].trim();
	                System.out.println("ID: " + id + " | Name: " + name);
	            }
	        }

	        reader.close();
	    }
	
}
