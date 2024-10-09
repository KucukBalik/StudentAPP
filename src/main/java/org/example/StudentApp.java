package org.example;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a student name: \n");
        String studentName = sc.nextLine();

        System.out.println("Please enter the student email: \n");
        String emailName = sc.nextLine();

        System.out.println("Please enter the student course: \n");
        String courseName = sc.nextLine();

        Student a = new Student();
        a.setName(studentName);




    }
}
