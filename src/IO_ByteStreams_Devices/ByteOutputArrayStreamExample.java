package IO_ByteStreams_Devices;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteOutputArrayStreamExample {

    public static void main(String[] args) {
        try {
            // ✅ Create output stream
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            // ✅ Write bytes to output stream
            String data = "Hello World!";
            output.write(data.getBytes()); // Convert string to bytes

            // ✅ Get the byte array from output stream
            byte[] array = output.toByteArray();

            System.out.println("Data written to byte array:");
            for (byte b : array) {
                System.out.print((char) b); // Convert byte back to character
            }

            // ✅ Close the stream
            output.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
