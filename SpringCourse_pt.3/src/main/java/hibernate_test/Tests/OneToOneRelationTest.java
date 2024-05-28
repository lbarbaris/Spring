package hibernate_test.Tests;

import hibernate_test.entity_OneToOne_Uni.Detail;
import hibernate_test.entity_OneToOne_Uni.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneRelationTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            //Employee employee = new Employee(100, "Ekaterina", "Litvinova", "Design");
            //Detail detail = new Detail("SpB", "1234567521512", "example2@yandex.ru");
            //employee.setEmpDetail(detail);


            session.beginTransaction();
            Employee emp = session.get(Employee.class, 5);
            System.out.println(emp.getEmpDetail());
            //session.save(employee);

           // session.delete(emp);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
