package IO_ByteStreams_Devices;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For Filtering the input
		//process 
		//contains some other input streams : CipherInputStream, Buffered input stream etc
		// and more subclasses
		//abstract class and abstract methods
		//filter streams filter data as they read and write the data in the Inputstream
		//filter it and pass to on to the underlying streams
		
		
		FileInputStream fis = null;
		
		FilterInputStream filterinput = null;
		
		try {
			
			//create file input stream for the file
			
			fis  = new FileInputStream("C://Users//ASUS//OneDrive//Desktop//mcq.txt");
			
			//wrapping file input stream with buffer input stream your internal  buffer stream created
			
			filterinput = new BufferedInputStream(fis);
			
			int data;
			
			while((data = filterinput.read()) != -1){
				System.out.println((char)data);
			}
			
			fis.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
