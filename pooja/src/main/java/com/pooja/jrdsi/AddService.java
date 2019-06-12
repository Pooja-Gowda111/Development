package com.pooja.jrdsi;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AddService implements  AddIF{

   public  List<AddEntity> save(final AddEntity addEntity){
       final AddEntity addEnt= new AddEntity();
       addEnt.setSalary(addEntity.getSalary());
       addEnt.setFirstName(addEntity.getFirstName());
       addEnt.setAge(addEntity.getAge());
       addEnt.setId(addEntity.getId());
        List<AddEntity> addListData= new ArrayList<AddEntity>();
       addListData.add(addEnt);
        return  addListData;
    }

    public AddEntity getAddData(final Integer id,String firstName){
       final AddEntity addEntity= new AddEntity();
        addEntity.setId(id);
        addEntity.setFirstName(firstName);
       return addEntity;
    }

    public   AddEntity findBySalary(final long salary){
       final AddEntity addEntity= new AddEntity();
        addEntity.setSalary(salary);

        return addEntity;

    }

    public List<AddEntity> findByLastName(final int age){
       final AddEntity addEnty= new AddEntity();
        addEnty.setAge(age);

       final List<AddEntity>  lstAddEnty= new ArrayList<AddEntity>();
        lstAddEnty.add(addEnty);

        return lstAddEnty;
    }

    public void delete(final Integer id){
         List<Integer> addDeletedData= new ArrayList<Integer>();
        addDeletedData.add(id);
    }

    public Set<AddEntity> getAllData(){
        final AddEntity addEntity= new AddEntity();
        addEntity.setSalary(8956);
        addEntity.setFirstName("raja");
        addEntity.setAge(25);
        addEntity.setId(5689);
        Set<AddEntity> setAddEnty= new HashSet<AddEntity>();
        setAddEnty.add(addEntity);
       return  setAddEnty;
    }

}
