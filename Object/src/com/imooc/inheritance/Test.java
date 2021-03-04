package com.imooc.inheritance;
import java.time.*;

public class Test {
    public static void main(String[] args) {
        //构建一个经理对象
        Manager boss=new Manager("Bluce",9000,2020,3,1);
        boss.setBonus(5000);

        //将经理和普通员工填入工作人员数组中
        Employee[] staff=new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("Harry", 5000,2017,4,2);
        staff[2]=new Employee("Susan", 8000,2019,8,6);

        //打印所有员工的薪酬
        for(Employee e:staff){
            System.out.println("name: " + e.getName() + ",Salary: " + e.getSalary());
        }
    }
}
