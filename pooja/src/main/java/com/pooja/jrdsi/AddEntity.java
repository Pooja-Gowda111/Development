package com.pooja.jrdsi;



public class AddEntity {

    private int id;
    private String firstName;
    private  int age;
    private long salary;

    public int getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {

        return age;
    }

    public long getSalary()
    {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
