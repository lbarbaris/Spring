package hibernate_test.entity_OneToMany_uni;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {



//Если удалится работник, департамент останется невридимым
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "salary")
    private int salary;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;



    public Employee() {
    }

    public Employee(int salary, String name, String surname) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String  toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

