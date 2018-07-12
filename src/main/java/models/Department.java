package models;


import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {


    private int id;
    private String name;
    private Manager manager;

    public Department(String name, Manager manager) {
        this.name = name;
        this.manager = manager;

    }

    public Department() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;}
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}


