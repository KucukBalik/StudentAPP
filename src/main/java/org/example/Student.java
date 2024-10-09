package org.example;

public class Student {

    private String name;
    private String email;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String email, String course)
    {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public Student() {
        this.name = null;
        this.email = null;
        this.course = null;



    }
}
