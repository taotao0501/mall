package com.imooc.reflect.entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 利用反射来调用方法
 *
 */
public class MethodSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{Integer.class,String.class,
                    Float.class,String.class});
            Employee employee = (Employee) constructor.newInstance(new Object[]{1000,"李雷",2000f,"研发部"});
            Method updateSalaryMethod = employeeClass.getMethod("updateSalary",Float.class);
            Employee employee1 =(Employee) updateSalaryMethod.invoke(employee,new Object[]{1000f});

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
