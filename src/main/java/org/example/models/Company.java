package org.example.models;

public class Company implements Node {

    private String name;
    private Integer employeesNumber;
    public Company(String name, Integer employeesNumber){
        this.name = name;
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getImportance() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employeesNumber=" + employeesNumber +
                '}';
    }
}
