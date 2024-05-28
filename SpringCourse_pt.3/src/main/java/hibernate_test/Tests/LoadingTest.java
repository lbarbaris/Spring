package hibernate_test.Tests;


import hibernate_test.entity_OneToMany_bi.Department;
import hibernate_test.entity_OneToMany_bi.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadingTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            /*Department department = new Department("IT", 100, 1500);
            Employee emp1 = new Employee(1500, "Pavel", "Martynov");
            Employee emp2 = new Employee(1100, "Anastasia", "Kostina");
            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);*/

            session.beginTransaction();
            Department department1 = session.get(Department.class, 1);
            System.out.println(department1);
            Employee employee1 = session.get(Employee.class, 8);
            System.out.println(employee1);
            System.out.println(employee1.getDepartment());
            // session.save(department);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}

