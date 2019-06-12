package com.pooja.employee;

import java.util.List;
import java.util.Set;

public class EmployeeController {

    private EmployeeService employeeService= new EmployeeService();


    public EmployeeEntity  save(EmployeeEntity employeeEntity){
        EmployeeEntity  result= employeeService.save(employeeEntity);

        return result;
    }

    public List<EmployeeEntity> findByEmployeeName(String employeeName){
        List<EmployeeEntity> result=employeeService.findByEmployeeName(employeeName);

        return result;
    }

    public Set<EmployeeEntity> findByEmployeeBranchId(String employeeBranchId){
        Set<EmployeeEntity> result=employeeService.findByEmployeeBranchId(employeeBranchId);
        return result;
    }

    public  List<EmployeeEntity> findByEmployeeSalary(Integer employeeSalary){
        List<EmployeeEntity> result=employeeService.findByEmployeeSalary(employeeSalary);
        return result;
    }

    public  List<EmployeeEntity> findByEmployeeCountry(String  employeeCountry){
        List<EmployeeEntity> result=employeeService.findByEmployeeCountry(employeeCountry);
        return result;
    }

    public void deleteById(int id){
        employeeService.deleteById(id);
    }

    public EmployeeEntity update(EmployeeEntity employeeEntity , int id){
        EmployeeEntity updateResultData=employeeService.update(employeeEntity, id);
        return updateResultData;
    }
}
