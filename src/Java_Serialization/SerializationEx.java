package Java_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     //Serialization is process of converting objects into bytes of string
	
		//write() object will do serialization also it is a interface
		//read() deserialization 
		
		
		//create an object 
		
		try {
		
		Student s1 = new Student(211,"Saksham Kanojia");
		
		//Crete the outpustream and writing the object now
		
		
		FileOutputStream fout = new FileOutputStream("D://s.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject((s1));
		
		out.flush();
	
		//flushes the stream or pushing to server client to server 
		
		//closing the stream
		out.close();
		
		System.out.println("Object is serialized");
	}
	 catch(Exception e) {
		 System.out.println(e);
		
		
	}

}
	}
