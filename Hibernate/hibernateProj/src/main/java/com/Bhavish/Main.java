package com.Bhavish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Bhavish");
        a1.setTech("Java");
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.Bhavish.Alien.class)
                .configure()
                .buildSessionFactory();

        Session Asession = sf.openSession();

        Transaction ATrac = Asession.beginTransaction();
        Asession.persist(a1);
        ATrac.commit();
        Asession.close();
        sf.close();
    }
}