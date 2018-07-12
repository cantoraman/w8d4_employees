package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {

    private Manager manager;


    public Administrator(String name, String NINumber, double salary, Manager manager){
        super( name,  NINumber,  salary);
        this.manager = manager;
    }


    public Administrator(){

    }


    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
