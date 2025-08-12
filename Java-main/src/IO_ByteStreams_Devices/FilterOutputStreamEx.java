package IO_ByteStreams_Devices;


import java.io.BufferedOutputStream;

import java.io.FileOutputStream;

import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	FileOutputStream fos = null;
		
		FilterOutputStream filterOut = null;
		
		try {
			
			//create file output stream to write to the file
			
			fos  = new FileOutputStream("C://Users//ASUS//OneDrive//Desktop//");
			
			//wrapping file input stream with buffer input stream your internal  buffer stream created
			
			filterOut = new BufferedOutputStream(fos);
			
			//write the data to the filter 
			
			String text = "Hi Who are you";
			
			filterOut.write(text.getBytes());
			
			fos.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			filterOut.close();
			fos.close();
		}
		
		
	}

}
