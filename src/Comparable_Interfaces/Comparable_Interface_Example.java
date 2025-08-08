package Comparable_Interfaces;

import java.util.*;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Natural ordering by roll number
    @Override
    public int compareTo(Student s) {
        return this.rollNumber - s.rollNumber;
    }

    @Override
    public String toString() {
        return rollNumber + " " + name;
    }
}

public class Comparable_Interface_Example {
    public static void main(String[] args) {
        /*
         * Comparable Interface
         * It is used to define natural ordering of objects so they can be sorted.
         */

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Saksham"));
        students.add(new Student(101, "Amit"));
        students.add(new Student(102, "Liya"));

        Collections.sort(students);  // Sorts using compareTo

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
