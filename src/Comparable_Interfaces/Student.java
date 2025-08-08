package Comparable_Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	
	
	
	int rollNumber;
	String name;
	
	public Student(int rollNumber,String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	//Implement Compare too method for natural ordering by roll number
	
	public int compareTo(Student s) {
		return this.rollNumber-s.rollNumber;
	}
	
	
	public String toString() {
		return rollNumber + " " + name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Comparable Interfaces
		 * 
		 * Interface is used to Sort the elements 
		 * */

		List<Student> students = new ArrayList<>();
		
		students.add(new Student (103,"Saksham"));
		students.add(new Student (101,"Amit"));
		students.add(new Student (102,"Liya"));
		
		Collections.sort(students);
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		
	}	
	


}
