package com.mnodhe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int rollNo;
    private int marks;
    private String name;
    @OneToMany
    private List<Laptop> laptop=new ArrayList<Laptop>();

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
