package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee(100000, "Pavel", "Martynov", "IT");
            session.beginTransaction();
            session.save(emp); // INSERT to MySQL
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
