package hibernate_test.Tests;

import hibernate_test.entity_ManyToMany.Child;
import hibernate_test.entity_ManyToMany.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyTest {
    public static void main(String[] args){
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Section.class).addAnnotatedClass(Child.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

            /*Section section = new Section("football");
            Child child = new Child("Petya", 12);
            Child child1 = new Child("Pavlik", 9);
            Child child2 = new Child("Vanya", 11);
            section.addChild(child);
            section.addChild(child1);
            section.addChild(child2);
            session.beginTransaction();

            session.persist(section);
            session.getTransaction().commit();*/


/*            Section section = new Section("basketball");
            Section section1 = new Section("volleyball");
            Section section2 = new Section("hockey");
            Child child = new Child("Kolya", 12);
            child.AddSection(section);
            child.AddSection(section2);
            child.AddSection(section1);

            session.beginTransaction();

            session.persist(child);
            session.getTransaction().commit();*/


/*            session.beginTransaction();
            Section section = session.get(Section.class, 1);

            session.getTransaction().commit();
            System.out.println(section);
            System.out.println(section.getChildren());*/


/*            session.beginTransaction();
            Section section = session.get(Section.class, 1);
            session.delete(section);
            session.getTransaction().commit();*/

            session.beginTransaction();
            Child child = session.get(Child.class, 4);
            session.delete(child);
            session.getTransaction().commit();


            System.out.println("Done");
        }
        finally {

        }
    }
}
