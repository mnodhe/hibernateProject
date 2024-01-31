package com.mnodhe;


import jakarta.persistence.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "alien_table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
     @Id
     private int aid;
     private String aname;

    public Collection<Laptop> getLaps() {
        return laps;
    }

    public void setLaps(Collection<Laptop> laps) {
        this.laps = laps;
    }

    @OneToMany(mappedBy = "alien")

     private Collection<Laptop> laps = new ArrayList<Laptop>();

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
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
