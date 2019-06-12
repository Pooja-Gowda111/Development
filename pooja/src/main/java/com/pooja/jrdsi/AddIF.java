package com.pooja.jrdsi;



import java.util.List;
import java.util.Set;


public interface AddIF {

   public  List<AddEntity> save(final AddEntity addEntity);

    AddEntity getAddData(final Integer id, String firstName);

    AddEntity findBySalary(final long salary);

    List<AddEntity> findByLastName(final int age);

    public void delete(final Integer id);

    public Set<AddEntity> getAllData();

}
