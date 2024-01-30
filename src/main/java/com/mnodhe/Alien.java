package com.mnodhe;


import jakarta.persistence.*;

@Entity
@Table(name = "alien_table")
public class Alien {
     @Id
     private int aid;
     private AlienName aname;

    public void setAname(AlienName aname) {
        this.aname = aname;
    }

    public AlienName getAname() {
        return aname;
    }

    @Column(name ="alien_color")
     private String color;

    public int getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + getAid() +
                ", aname='" + getAname().toString() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }

    public void setAid(int aid) {
        this.aid = aid;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
