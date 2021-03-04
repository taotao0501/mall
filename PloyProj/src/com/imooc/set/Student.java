package com.imooc.set;

public class Student {
    private String stuNum;
    private String stuName;
    private int age;

    public Student(String stuNum,String stuName,int age){
        this.stuNum=stuNum;
        this.stuName=stuName;
        this.age=age;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " [学号：" + stuNum + ", 姓名：" +
                stuName + ", 年龄：" + age + "]";
    }
}
