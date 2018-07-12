import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;

import java.util.List;

public class Runner {


    public static void main(String[] args) {

        Manager manager = new Manager("John", "123", 1000, 9999);
        DBHelper.save(manager);
        Department department = new Department("computers", manager);
        DBHelper.save(department);


        Administrator admin1 = new Administrator("George", "1233", 1234, manager);
        Administrator admin2 = new Administrator("Ringo", "54234", 1242234, manager);
        DBHelper.save(admin1);
        DBHelper.save(admin2);

        List<Administrator> admins = DBManager.getAllAdmins(manager);
        Department foundDep = DBManager.getDepartment(manager);

    System.exit(0);
    }
}
