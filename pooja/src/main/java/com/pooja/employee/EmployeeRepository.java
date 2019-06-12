package com.pooja.employee;

import java.util.List;
import java.util.Set;

public interface EmployeeRepository {

    public EmployeeEntity  save(EmployeeEntity employeeEntity);

    public List<EmployeeEntity> findByEmployeeName(String employeeName);

    public Set<EmployeeEntity> findByEmployeeBranchId(String employeeBranchId);

    public  List<EmployeeEntity> findByEmployeeSalary(Integer employeeSalary);
    public  List<EmployeeEntity> findByEmployeeCountry(String employeeCountry);

    public void deleteById(int id);

    public EmployeeEntity update(EmployeeEntity employeeEntity, int id);

}
