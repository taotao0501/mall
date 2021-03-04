package com.imooc.inheritance;

import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee() {

    }
    public Employee(String name,double salary,int year,int month,int day){
        this.setName(name);
        this.setSalary(salary);
        hireDay=setHireDay(year,month,day);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public LocalDate setHireDay(int year, int month, int day) {
        return LocalDate.of(year, month, day);

    }

    public void raiseSalary(double byPercent) {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
