package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            int myId = 1;
            //Employee empolyee = session.get(Employee.class, myId);
            //session.delete(empolyee);


            session.createQuery("delete Employee " + "where salary > 5000").executeUpdate();
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }
    }
}
