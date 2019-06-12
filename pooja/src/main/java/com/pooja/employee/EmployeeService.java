package com.pooja.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeService implements EmployeeRepository {

    public EmployeeEntity  save(EmployeeEntity employeeEntity){
        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(employeeEntity.getId());
        entityObject.setEmployeeBranchId(employeeEntity.getEmployeeBranchId());
        entityObject.setEmployeeName(employeeEntity.getEmployeeName());
        entityObject.setEmployeeAddress(employeeEntity.getEmployeeAddress());
        entityObject.setEmployeeCountry(employeeEntity.getEmployeeCountry());
        entityObject.setEmployeeSalary(employeeEntity.getEmployeeSalary());

        return entityObject;
    }

    public List<EmployeeEntity> findByEmployeeName(String employeeName){
        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(1234L);
        entityObject.setEmployeeBranchId("12");
        entityObject.setEmployeeName("pooja");
        entityObject.setEmployeeAddress("Hebbal");
        entityObject.setEmployeeCountry("India");
        entityObject.setEmployeeSalary(8000L);
        List<EmployeeEntity> employeeResults= new ArrayList<EmployeeEntity>();
        if(employeeName.equals(entityObject.getEmployeeName())){
            employeeResults.add(entityObject);
        }
      return employeeResults;
    }

    public Set<EmployeeEntity> findByEmployeeBranchId(String employeeBranchId){
        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(1234L);
        entityObject.setEmployeeBranchId("12");
        entityObject.setEmployeeName("pooja");
        entityObject.setEmployeeAddress("Hebbal");
        entityObject.setEmployeeCountry("India");
        entityObject.setEmployeeSalary(8000L);
        Set<EmployeeEntity> employeeResults= new HashSet<EmployeeEntity>();
        if(employeeBranchId.equals(entityObject.getEmployeeBranchId())){
            employeeResults.add(entityObject);
        }
        return employeeResults;

    }

    public  List<EmployeeEntity> findByEmployeeSalary(Integer employeeSalary){
        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(1234L);
        entityObject.setEmployeeBranchId("12");
        entityObject.setEmployeeName("pooja");
        entityObject.setEmployeeAddress("Hebbal");
        entityObject.setEmployeeCountry("India");
        entityObject.setEmployeeSalary(8000L);
        List<EmployeeEntity> employeeResults= new ArrayList<EmployeeEntity>();
        if(employeeSalary.equals(entityObject.getEmployeeSalary())){
            employeeResults.add(entityObject);
        }
        return employeeResults;

    }
    public  List<EmployeeEntity> findByEmployeeCountry(String  employeeCountry){

        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(1234L);
        entityObject.setEmployeeBranchId("12");
        entityObject.setEmployeeName("pooja");
        entityObject.setEmployeeAddress("Hebbal");
        entityObject.setEmployeeCountry("India");
        entityObject.setEmployeeSalary(8000L);
        List<EmployeeEntity> employeeResults= new ArrayList<EmployeeEntity>();
        if(employeeCountry.equals(entityObject.getEmployeeSalary())){
            employeeResults.add(entityObject);
        }
        return employeeResults;
    }

    public void deleteById(int id){
         List<Integer> deleteEmployeeRecord= new ArrayList<Integer>();
        deleteEmployeeRecord.add(id);
    }

    public EmployeeEntity update(EmployeeEntity employeeEntity , int id){
        EmployeeEntity entityObject= new EmployeeEntity();
        entityObject.setId(1234L);
        entityObject.setEmployeeBranchId("12");
        entityObject.setEmployeeName("pooja");
        entityObject.setEmployeeAddress("Hebbal");
        entityObject.setEmployeeCountry("India");
        entityObject.setEmployeeSalary(8000L);
        EmployeeEntity entityUpdatedData= new EmployeeEntity();
        if(entityObject.getId()==id){
            entityUpdatedData.setId(employeeEntity.getId());
            entityUpdatedData.setEmployeeSalary(employeeEntity.getEmployeeSalary());
            entityUpdatedData.setEmployeeCountry(employeeEntity.getEmployeeCountry());
            entityUpdatedData.setEmployeeAddress(employeeEntity.getEmployeeAddress());
            entityUpdatedData.setEmployeeBranchId(employeeEntity.getEmployeeBranchId());
        }

        return entityUpdatedData;
    }
}
