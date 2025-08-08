package IO_ByteStreams_Devices;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//writing of data to file
	String data = "I am attedning java  class";
	
	try {
		
		FileOutputStream output = new FileOutputStream("D://a.txt");
		
		
		byte[] array = data.getBytes();
		
		output.write(array);
		output .close();
		
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

}
