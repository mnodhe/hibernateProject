package com.mnodhe;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Laptop {
    @Id
    private int lid;
    private String lName;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lname='" + lName + '\'' +
                '}';
    }

}
