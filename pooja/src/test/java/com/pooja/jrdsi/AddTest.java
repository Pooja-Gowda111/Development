package com.pooja.jrdsi;

import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RunWith(MockitoJUnitRunner.class)
 public class AddTest {

    @Mock
    AddService addService;

    @InjectMocks
    Add add;


    private AddEntity addEntity;
    private List<AddEntity> list;
    private long salary;

    private int id;
    private String firstName;
    private int age;
    private Set<AddEntity> setData;

    @Before
    public void setUp() {
        addEntity = new AddEntity();
        addEntity.setId(11);
        addEntity.setSalary(20000);
        addEntity.setFirstName("pooja");
        addEntity.setAge(23);
        list = new ArrayList<AddEntity>();
        list.add(addEntity);

        id = 11;
        firstName = "pooja";
        salary = 20000;
        age = 23;

        setData=new HashSet<AddEntity>();
        setData.add(addEntity);


    }

    @Test
    public void saveTest() {
        when(addService.save(addEntity)).thenReturn(list);
        List<AddEntity> result = add.save(addEntity);
        assertEquals(result.size(), 1);
        verify(addService).save(addEntity);

    }

    @Test
    public void getAddDataTest() {
        when(addService.getAddData(id, firstName)).thenReturn(addEntity);
        AddEntity result = add.getAddData(id, firstName);
        assertEquals(result.getId(), 11);
        assertEquals(result.getAge(), 23);
        assertEquals(result.getFirstName(), "pooja");
        assertEquals(result.getSalary(), 20000);
        verify(addService).getAddData(id, firstName);
    }

    @Test
    public void findBySalaryTest() {
        when(addService.findBySalary(salary)).thenReturn(addEntity);
        AddEntity result = add.findBySalary(salary);
        assertEquals(result.getSalary(), 20000);
        verify(addService).findBySalary(salary);

    }

    @Test
    public void findByLastNameTest() {
        when(addService.findByLastName(age)).thenReturn(list);
        List<AddEntity> result = add.findByLastName(age);
        assertEquals(result.size(), 1);
        verify(addService).findByLastName(age);

    }
    @Test
    public void deleteTest(){
        add.delete(id);
    }

    @Test
    public void getAllDataTest(){
        when(addService.getAllData()).thenReturn(setData);
        Set<AddEntity> result=add.getAllData();
        assertEquals(result.size(),1);
        verify(addService).getAllData();


    }
}