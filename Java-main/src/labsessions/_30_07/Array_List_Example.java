package labsessions._30_07;

import java.util.ArrayList;

public class Array_List_Example {

    public static void main(String[] args) {

        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the list of colors
        System.out.println("List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
