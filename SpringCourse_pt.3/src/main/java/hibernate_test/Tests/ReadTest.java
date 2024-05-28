package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ReadTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            // List emps = session.createQuery("from Employee").getResultList();
            List emps = session.createQuery("from Employee " + "WHERE department = 'LADA'").getResultList();
            for (Object e: emps){
                System.out.println(e);
            }

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
