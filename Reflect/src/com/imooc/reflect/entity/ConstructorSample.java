package com.imooc.reflect.entity;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用构造方法来创建对象
 */
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{Integer.class,String.class,
                    Float.class,String.class});
            Employee employee = (Employee) constructor.newInstance(new Object[]{1000,"李雷",2000f,"研发部"});
            System.out.println(employee);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {

            e.printStackTrace();
        }
    }
}
