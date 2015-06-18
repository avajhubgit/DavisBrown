import java.util.ArrayList;
import java.util.List;

public class DimaSerial {
    private static final long serialVersionUID = 7;
    //collection of departments
    private final transient List<Department> departments = new ArrayList<>();
    //collection of employees
    private final List<Employee> employees = new ArrayList<>();
   
    public transient String transientStr = "test";

    public DimaSerial() {
    }

    //count of departments
    public int departmentCount(){
      return departments.size();
    }

    //count of employees
    public int employeeCount(){
      return employees.size();
    }
    
    public void initSmall(){
        //create one department and add to list
        departments.add(new Department(1, "Information and technology department"));
     
        //create one employee and add to list
        employees.add(new Employee(1, "John", "Smith", "novus", "hwejj23948293fj", "fox@gmail.com", 1, "673-91-03", "Programmer"));
    }

    public void initMiddle(){
        initSmall();
        //create departments and add to list
        departments.add(new Department(2, "Sales department"));
        departments.add(new Department(3, "Accounting department"));
        departments.add(new Department(4, "Purchasing department"));
        departments.add(new Department(5, "Human resources department"));

        //create employees and add to list
        employees.add(new Employee(2, "Williams", "Antony", "opke", "jhwqi78r487h1o3jfhhqwf", "qwop@aol.com", 2, "740-58-23", "Accountant"));
        employees.add(new Employee(3, "Brown", "Mary", "djoerk", "qioqh2t8hteurhfgowjer", "klas@tns.org", 5, "582-93-72", "Manager"));
        employees.add(new Employee(4, "Davis", "Peter", "pet930", "ghw87y2u3rhfqeufu8", "wbom@gmail.com", 5, "930-93-76", "Driver"));
        employees.add(new Employee(5, "Miller", "Cristine", "knu", "jkqt4h283uhtuiqhfwdwerg", "dfa@hotmail.com", 9, "346-87-39", "Seller"));
    }
  
    public void initLarge(){
        initMiddle();
        //create departments and add to list
        departments.add(new Department(6, "Department of orders"));
        departments.add(new Department(7, "Wholesale department"));
        departments.add(new Department(8, "Corporate department"));
        departments.add(new Department(9, "Customer care department"));
        departments.add(new Department(10, "Production department"));

        //create employees and add to list
        employees.add(new Employee(6, "Taylor", "Ann", "an70", "q3th9rfiqwfherwg", "aswn_hop@gmail.com", 3, "234-49-90", "Seller"));
        employees.add(new Employee(7, "Anderson", "Tom", "tommy", "13io4jtu0934hgui3trg", "cro@aol.com", 2, "456-34-54", "Programmer"));
        employees.add(new Employee(8, "Thomas", "Lee", "lee", "h2t982hr3ofuhwerufh2374t", "hjak@uk.org", 5, "345-39-09", "Consultant"));
        employees.add(new Employee(9,"Jackson", "Bill", "jer", "4iouht24gfwwergwerg", "wep@hotmail.com", 5, "384-73-89", "Executive director"));
        employees.add(new Employee(10, "White", "Aprile", "ape", "2jihf247hfui2rhguerhgrt", "apq@yahoo.com", 3, "345-43-90", "Manager"));
    }  
}