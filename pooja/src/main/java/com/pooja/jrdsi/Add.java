package com.pooja.jrdsi;


import java.util.List;
import java.util.Set;

public class Add {


    private AddService addService= new AddService();



    public List<AddEntity> save(final AddEntity addEntity){
        final List<AddEntity>  results=addService.save(addEntity);
        return results;
    }

    public AddEntity getAddData(final Integer id,String firstName){
        return  addService.getAddData(id, firstName);
    }


    public   AddEntity findBySalary(final long salary){
        AddEntity result =addService.findBySalary(salary);
        return result;
    }

    public List<AddEntity> findByLastName(final int age){

        List<AddEntity> result= addService.findByLastName(age);
        return result;
    }

    public void delete(final Integer id){

        addService.delete(id);
    }

    public Set<AddEntity> getAllData(){

        Set<AddEntity> result= addService.getAllData() ;
        return result;
    }



}
