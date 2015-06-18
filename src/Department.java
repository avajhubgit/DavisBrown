public class Department {
    private final Integer departmentId;
    private final String departmentName;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Department(Integer departmentId,
            String departmentName) {
       this.departmentId = departmentId;
       this.departmentName = departmentName;
    }
}


