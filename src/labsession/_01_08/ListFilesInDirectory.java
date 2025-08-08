package labsession._01_08;

import java.io.File;

public class ListFilesInDirectory {

	 public static void main(String[] args) {
	        File folder = new File("D://myFolder"); // ✅ Change to your target folder path
	        File[] listOfFiles = folder.listFiles();

	        if (listOfFiles != null) {
	            for (File file : listOfFiles) {
	                if (file.isFile()) {
	                    System.out.println("File: " + file.getName());
	                } else if (file.isDirectory()) {
	                    System.out.println("Directory: " + file.getName());
	                }
	            }
	        } else {
	            System.out.println("Directory does not exist or is empty.");
	        }
	    }
	
}
