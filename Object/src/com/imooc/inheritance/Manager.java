package com.imooc.inheritance;

public class Manager extends Employee {
    private double bonus;
    /**
     * name:Employee's name
     * salary:Employee's salary
     * year month day:Employee's hireDate
     */
    public Manager(String name,double salary,int year,int month,int day) {
        super(name,salary,year,month,day);
        bonus=0;
    }

    @Override
    public double getSalary() {
        double baseSalary=super.getSalary();
        return bonus+baseSalary;
    }

    public void setBonus(double bonus) {
        this.bonus=bonus;
    }
}
