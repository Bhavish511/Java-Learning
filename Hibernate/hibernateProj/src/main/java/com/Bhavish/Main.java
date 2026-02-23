package com.Bhavish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        System.out.println(s1);

//        s1.setsName("Sunny");
//        s1.setRollNo(108);
//        s1.setsAge(23);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.Bhavish.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(com.Bhavish.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session = sf.openSession();
        // Creating
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        save(s1);
//        transaction.commit();

//        session.close();
        // Fetching
//        Session session1 = sf.openSession();
//        Student s2 = session1.get(Student.class, 101);
//        session1.close();
//        sf.close();
//        System.out.println(s2);
//        System.out.println(s1);

//        Updating
//        s1.setsName("Bhavish");
//        s1.setRollNo(109);
//        s1.setsAge(50);

//        Session session2 = sf.openSession();
//        Transaction t1 = session2.beginTransaction();
//        session2.merge(s1);
//        t1.commit();
//        session2.close();
//        sf.close();

//        Delete
//        Session session3 = sf.openSession();
//        Student s3 = session3.get(Student.class, 109);
//
//        System.out.println(s3);
//        Transaction t4 = session3.beginTransaction();
//        session3.remove(s3);
//        t4.commit();
//        session3.close();
//        sf.close();

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setRam(16);
        l1.setModel("Rog");

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Hp");
        l2.setRam(16);
        l2.setModel("Core i7");

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Dell");
        l3.setRam(32);
        l3.setModel("XPS");

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Bhavish");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Sunny");
        a2.setTech("Node");

        Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname("Qasim");
        a3.setTech("Python");

        a1.setLaptop(Arrays.asList(l1,l2));
        a2.setLaptop(Arrays.asList(l2,l3));
        a3.setLaptop(Arrays.asList(l1));

        l1.setAlien(Arrays.asList(a1,a3));
        l2.setAlien(Arrays.asList(a1,a2));
        l3.setAlien(Arrays.asList(a2));
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.Bhavish.Alien.class)
                .addAnnotatedClass(com.Bhavish.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session Asession = sf.openSession();

        Transaction ATrac = Asession.beginTransaction();
        Asession.persist(a1);
        Asession.persist(a2);
        Asession.persist(a3);
        Asession.persist(l1);
        Asession.persist(l2);
        Asession.persist(l3);

        ATrac.commit();

        Alien A5 = Asession.get(Alien.class,102);
        System.out.println("Fetched Data: "+ A5);
        Asession.close();
        sf.close();
    }
}