public class Employee {
    private Integer employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeLogin;
    private String employeePassword;
    private String employeeEmail;
    private Integer departmentID;//the department in which the employee works
    private String employeePhone;
    private String employeePosition;//position name
  
    public Employee(){
    }
            
    public Employee(Integer employeeID,
                    String employeeFirstName,
                    String employeeLastName,
                    String employeeLogin,
                    String employeePassword,
                    String employeeEmail,
                    Integer departmentID,
                    String employeePhone,
                    String employeePosition
                    ){
        this.employeeID = employeeID;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeLogin = employeeLogin;
        this.employeePassword = employeePassword;
        this.employeeEmail = employeeEmail;
        this.departmentID = departmentID;
        this.employeePhone = employeePhone;
        this.employeePosition = employeePosition;
    }
}