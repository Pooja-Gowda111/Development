package com.pooja.employee;

public class EmployeeEntity {

    private Long id;

    private String employeeBranchId;

    private String employeeName;

    private String employeeAddress;

    private Long employeeSalary;

    private String  employeeCountry;

    public Long getId() {
        return id;
    }

    public String getEmployeeBranchId() {
        return employeeBranchId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public Long getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeCountry() {
        return employeeCountry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmployeeBranchId(String employeeBranchId) {
        this.employeeBranchId = employeeBranchId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeSalary(Long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeCountry(String employeeCountry) {
        this.employeeCountry = employeeCountry;
    }
}


