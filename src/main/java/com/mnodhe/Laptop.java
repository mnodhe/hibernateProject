package com.mnodhe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String lName;
    @ManyToMany
    private List<Student> student = new ArrayList<Student>();

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lName + '\'' +
                '}';
    }

}
