package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Student_SEQ")
    @SequenceGenerator(name = "Student_SEQ", sequenceName = "Student_SEQ", allocationSize = 1)
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private int totMarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotMarks() {
        return totMarks;
    }

    public void setTotMarks(int totMarks) {
        this.totMarks = totMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", totMarks=" + totMarks +
                '}';
    }
}
