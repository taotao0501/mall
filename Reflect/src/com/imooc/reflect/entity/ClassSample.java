package com.imooc.reflect.entity;

public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到jvm,并返回对应Class对象
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            System.out.println("Employee已被加载到jvm");
            Employee emp = (Employee)employeeClass.newInstance();
            System.out.println(emp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //当在作用域外访问方法或成员变量 如private修饰的方法或变量
            e.printStackTrace();
        } catch (InstantiationException e) {
            //对象无法实例化，例如 抽象类
            e.printStackTrace();
        }
    }
}
