import db.DBHelper;
import models.Department;
import models.Manager;

public class Runner {


    public static void main(String[] args) {

        Manager manager = new Manager("John", "123", 1000, 9999);


        Department department = new Department("computers", manager);
        DBHelper.save(manager);
        DBHelper.save(department);





    System.exit(0);
    }
}
