package com.imooc.Subject;

public class Test {
    public static void main(String[] args) {
        Subject sub1=new Subject("计算机科学与应用","J0001", 4);
        System.out.println(sub1.info());
        System.out.println("~~~~~~");

        Student stu1=new Student("张三","S01","男",18);
        System.out.println(stu1.info("计算机科学与应用",4));
        System.out.println("~~~~~~");

        Student stu2=new Student("李四","S02","女",17);
        System.out.println(stu2.info(sub1));
        System.out.println("~~~~~~");

        Student stu3=new Student("王五","S03","男",18,sub1);
        System.out.println(stu3.info());

        //测试指定专业中有多少学生报名
        sub1.addStudent(stu1);
        sub1.addStudent(stu1);
        sub1.addStudent(stu1);
        System.out.println(sub1.getName() + "的专业中有" + sub1.getStudentNum() + "个学生在学习。");
    }
}
