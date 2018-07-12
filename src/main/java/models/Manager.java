package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "managers")
public class Manager extends Employee{

    private double budget;
    private Department department;

    private List<Administrator> administratorList;


    public Manager(String name, String NINumber, double salary, double budget){
        super(name,  NINumber,  salary);
        this.budget = budget;

    }

    public Manager(){}


    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Department getDepartment(){
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministratorList(){
        return this.administratorList;
    }
    public void setAdministratorList(List<Administrator> administratorList) {
        this.administratorList = administratorList;
    }
}
