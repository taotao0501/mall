package com.imooc.reflect.entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldSample {
    public static void main(String[] args) {
        //这里的name是public，
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{Integer.class,String.class,
                                        Float.class,String.class});
            Employee employee = (Employee) constructor.newInstance(new Object[]{100,"李雷",3000f,"研发部"});
            Field enameField = employeeClass.getField("ename");
            String ename = (String) enameField.get(employee);
            enameField.set(employee,"王大锤");
            String ename1 = (String) enameField.get(employee);
            System.out.println("ename: " + ename);
            System.out.println("ename1: " + ename1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
