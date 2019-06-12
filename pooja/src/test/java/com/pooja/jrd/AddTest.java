package com.pooja.jrd;


import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

import static junit.framework.TestCase.*;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class AddTest {

    @InjectMocks
     Add ref;

    private int a;
    private int b;
    private String name;
    private List<String> lstData;
    private boolean d, d1;
    private  List<String> actualStopList;
    private List<String> lst;
    private int id;
    private String namee;
    private List<Date> startDate;
    private Map<String,Integer> str;

    @Before
    public void setUp() {
        lstData = new ArrayList<String>();
        lst = new ArrayList<String>();
        actualStopList=new ArrayList<String>();
        startDate=new ArrayList<Date>();
        startDate.add(new Date());
        str=new HashMap<String, Integer>();
        str.put("pooja",11);
        a = 90;
        b = 10;
        name = "pooja";
        lstData.add("pooja");
        d = true;
        d1 = false;
        lst.add("bbb");
        actualStopList.add("ddd");
        id=11;
       namee="pooja";

    }

   @Test
    public void addTest(){
        int result=ref.add(a,b);
        assertEquals(100,result);

    }
    @Test
    public void subTest(){
        int result=ref.sub(a,b);
        assertEquals(80,result );
    }
    @Test
    public void getNameTest(){
        String s=ref.getName(name);
        assertEquals("pooja",s );
    }
    @Test
    public void  getListIntegerDataTest(){
    List<Integer>  result=ref. getListIntegerData(a,b);
   assertNotNull(result);
    }

    @Test
    public void getListStringDataTest(){
        Set<String> result=ref.getListStringData(lstData);
        assertNotNull(result);
    }

    @Test
    public void setValiDataTrueTest(){
        boolean result=ref.setValiData(d);
        assertTrue(result);
    }


    @Test
    public void setValiDataFalseTest(){
        boolean result=ref.setValiData(d1);
        assertFalse(result);
    }

    @Test
     public void getMapDataTest(){
       Map<String, Integer> result=ref.getMapData(lst);
       assertEquals(result.size(), 1);
        }
      @Test
     public void findTest(){
           List<String> result=ref.find(actualStopList);
        assertNotNull(actualStopList);
          }
      @Test
    public void deleteTest(){
        ref.delete(id);
      }

      @Test
     public void buildActualTest(){
          Set<String> result=ref.buildActual(name);
          assertNotNull(name);
      }

      @Test
     public void ActualDeliveryWindowTest(){
          Date  startDate =new Date();
          List<Date> result=ref.ActualDeliveryWindow(startDate);
          assertNotNull(startDate);
      }

      @Test
    public void getDataTest(){
         Map<String, Integer> result=ref.getData(id,name);
          assertThat(result.size(), is(1));


     }

}
