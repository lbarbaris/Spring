package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetObjectFromBDTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            int myId = 2;
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee empolyee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(empolyee);
        }
        finally {
            factory.close();
        }
    }
}
