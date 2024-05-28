package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Bi.Detail;
import hibernate_test.entity_OneToOne_Bi.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneRelationTest2 {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            //Employee emp = new Employee(100, "Evgenia", "Ivashenko", "English language");
            //Detail detail = new Detail("Orel", "321", "example3@yandex.ru");
            //emp.setEmpDetail(detail);
            //detail.setEmployee(emp);

            session.beginTransaction();
            Detail detail1 = session.get(Detail.class, 3);
            System.out.println(detail1.getEmployee());
            //session.save(detail);

            // session.delete(detail);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
