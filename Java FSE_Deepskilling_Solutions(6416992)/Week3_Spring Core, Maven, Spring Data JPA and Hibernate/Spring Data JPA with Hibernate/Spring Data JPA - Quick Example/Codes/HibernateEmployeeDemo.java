package com.cognizant.ormlearn.hibernate;

import com.cognizant.orm_learn.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateEmployeeDemo {

    public static void main(String[] args) {

        // Create Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        // Create SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        // Begin transaction
        session.beginTransaction();

        // Create an employee
        Employee emp = new Employee("John Doe", 50000.0);

        // Save to DB
        session.save(emp);

        // Commit transaction
        session.getTransaction().commit();

        System.out.println("Employee inserted: " + emp);

        // Close session
        session.close();
        sessionFactory.close();
    }
}
