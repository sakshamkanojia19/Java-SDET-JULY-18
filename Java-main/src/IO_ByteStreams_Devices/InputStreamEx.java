package IO_ByteStreams_Devices;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx {

    public static void main(String[] args) {
        FileInputStream input = null;

        try {
            // ✅ Open the file (update path as needed)
            input = new FileInputStream("C://Users//ASUS//OneDrive//Desktop//mcq.txt");

            System.out.println("Data in the file:");

            int i = input.read();  // read one byte

            while (i != -1) {
                System.out.print((char) i);  // convert byte to char and print
                i = input.read();  // read next byte
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // ✅ Always close file to free resources
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
