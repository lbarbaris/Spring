package hibernate_test.entity_OneToOne_Bi;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {




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

    @Column(name = "department")
    private String department;
                                        //по умолчанию cascade не стоит
    @OneToOne (cascade = CascadeType.ALL) // выбираем какие каскадные операции будут применимы к нашей связке, здесь выбраны ВСЕ
    @JoinColumn(name = "details_id")
    private Detail empDetail; // Одностороннее отношение One to One (Uni relationship)

    public Employee() {
    }


    public Employee(int salary, String name, String surname, String department) {
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }
}
