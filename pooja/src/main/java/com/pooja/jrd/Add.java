package com.pooja.jrd;
import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.*;

public class Add {

    public int add(int a, int b){
        int c= a+b;
        return c;
    }


    public int sub(int a, int b){
        int c;
        c= a-b;
        return c;
    }


    public String getName(String name){
        String s= name;
        return  s;
    }


    public List<Integer> getListIntegerData(int a, int b){
          List<Integer> lstData= new ArrayList<Integer>();
          lstData.add(a);
          lstData.add(b);
        return  lstData;
    }


    public Set<String>getListStringData(List<String> lstData){

        Set<String> addListData= new HashSet<String>();
        for(String s: addListData)
            addListData.add(s);
        return addListData;
    }


    public boolean setValiData(boolean b){

        if(b==true){
            return b;
        }else {
            return b;
        }
    }


    public Map<String, Integer> getMapData(List<String> lst){
     int i=0;
    Map<String, Integer> resultData=new HashMap<String, Integer>();
     for(String data: lst){
     resultData.put(data, ++i);
     }
     return resultData;
    }

 public List<String> find(final List<String> actualStopList) {
        final List<String> deliveries =new ArrayList<String>();
        for(String st:actualStopList) {
            deliveries.add(st);
        }
        return deliveries;
    }


    public void delete(final int id){

        List<Integer> deletId = new ArrayList<Integer>();
        deletId.add(id);

    }


    public  Set<String> buildActual(final String name){

        Set<String> addData= new HashSet<String>();
        addData.add(name);
       return addData;
    }

    public List<Date> ActualDeliveryWindow(final Date startDate ){
        List<Date> dateList= new ArrayList<Date>();
        dateList.add(startDate);

        return  dateList;

    }

    public Map<String, Integer>getData(int id, String name){

        Map<String, Integer> lstEntry= new HashMap();
        lstEntry.put(name, id);
        return lstEntry;
    }

}
