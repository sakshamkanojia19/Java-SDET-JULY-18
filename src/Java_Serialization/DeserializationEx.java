package Java_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Create the stream and read the object
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://s.txt"));

		Student s = (Student) in.readObject();
		
		//Printing the object details
		
		System.out.println(s.id+" "+s.name);
		
		in.close();
		
	}

}
