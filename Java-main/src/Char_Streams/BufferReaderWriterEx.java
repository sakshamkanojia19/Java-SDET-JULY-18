package Char_Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//To read and write line by line buffered reader ad writer is used
		
		//Write to file
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://b.txt"));
		bw.write("I am buffered file writer");
		
		bw.close();
		
		
		//Read the file
		
		BufferedReader br = new BufferedReader(new FileReader("D://b.txt"));
		
		String line;
		
		while((line = br.readLine()) != null) {
		
			System.out.println(line);
		}
		
		br.close();
	}

}
