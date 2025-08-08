package IO_ByteStreams_Devices;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample { // ✅ Renamed to avoid conflict

    public static void main(String[] args) {
        // It will read the byte array using ByteArrayInputStream

        byte[] array = {1, 2, 3, 4};

        try {
            // ✅ Using Java's built-in ByteArrayInputStream
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            for (int i = 0; i < array.length; i++) {
                int data = input.read(); // Reads one byte
                System.out.println("Byte read: " + data);
            }

            input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



//read the array of input data
		//reading in terms of bytes