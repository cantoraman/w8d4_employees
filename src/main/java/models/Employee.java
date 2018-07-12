package models;

import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    private int id;
    private String name;
    private String NINumber;
    private double salary;


    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "salary")
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Column(name = "ni_number")
    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

}
