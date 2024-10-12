package org.example;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        // Instance 1: Default constructor, set details using setters
        Student student1 = new Student();
        getDetails(student1);  // Pass student1 to getDetails method

        // Instance 2: Constructor with name, set other details using setters
        Student student2 = new Student("Emre");
        getDetails(student2);  // Pass student2 to getDetails method

        // Instance 3: Constructor with name, email, and course
        Student student3 = new Student("John", "atu.ie", "Software");

        // Display student details using getter methods
        System.out.println("\nStudent 1: Name: " + student1.getName() + ", Email: " + student1.getEmail() + ", Course: " + student1.getCourse());
        System.out.println("Student 2: Name: " + student2.getName() + ", Email: " + student2.getEmail() + ", Course: " + student2.getCourse());
        System.out.println("Student 3: Name: " + student3.getName() + ", Email: " + student3.getEmail() + ", Course: " + student3.getCourse());
    }


    public static void getDetails(Student student) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        student.setName(sc.nextLine());  // Set name using setter

        System.out.println("Enter student email: ");
        student.setEmail(sc.nextLine());  // Set email using setter

        System.out.println("Enter student course: ");
        student.setCourse(sc.nextLine());  // Set course using setter
    }
}
