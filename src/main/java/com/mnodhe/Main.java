package com.mnodhe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
//        AlienName aname = new AlienName();
//        aname.setFname("family name");
//        aname.setLname("last name");
//        aname.setMname("middle name");
//        Alien telusko = new Alien();
//        telusko.setAid(101);
//        telusko.setColor("Green");
//        telusko.setAname(aname);


        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLName("Dell");

        Student student = new Student();
        student.setName("Navin");
        student.setMarks(1);
        student.setRollNo(50);
        student.getLaptop().add(laptop);

        Configuration con = new Configuration().configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();


        session.save(laptop);
        session.save(student);
        tx.commit();
//        telusko =session.get(Alien.class,101);

//        session.save(telusko);
//        tx.commit();
//        System.out.println(telusko);

    }
}