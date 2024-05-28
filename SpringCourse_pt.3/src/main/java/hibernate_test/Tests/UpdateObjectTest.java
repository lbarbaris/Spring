package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateObjectTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            /*Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1500);*/
            session.createQuery("UPDATE Employee set salary=1234 " + "WHERE department = 'LADA'").executeUpdate();
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
