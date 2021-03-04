package com.imooc.set;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> stuList = new LinkedList<Student>();

        Student stu1 = new Student("001","Mike",18);
        Student stu2 = new Student("002","Jack",19);
        Student stu3 = new Student("003","Lucy",20);

        stuList.push(stu1);
        stuList.push(stu2);
        stuList.push(stu3);
        System.out.println("链表为：" + stuList);

        //先进后出 push pop
        System.out.println("弹出的数据是：" + stuList.pop());
        System.out.println("弹出后链表为：\n" + stuList);

        // peak 瞄一眼第一个元素，不移除
        System.out.println("调用peek()方法的数据为："+stuList.peek());
        System.out.println("瞄一眼后链表为：\n" + stuList);
    }
}
