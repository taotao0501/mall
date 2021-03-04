package com.imooc.Subject;

public class Student {
    private String name;
    private String id;
    private String gender;
    private int age;
    private Subject studentSubject;

    public Student(){

    }
    //将专业与学生相关联，少写代买，有三种方法比较好：直接传参，将对象作为参数，和将对象作为类属性
    public Student(String name,String id,String gender,int age) {
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.age=age;
    }

    public Student(String name,String id,String gender,int age, Subject studentSubject) {
        this.setName(name);
        this.setId(id);
        this.setGender(gender);
        this.setAge(age);
        this.setStudentSubject(studentSubject);
    }

    public Subject getStudentSubject(){
        if(studentSubject==null){
            Subject studentSubject = new Subject();
        }
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >18 && age <100)
            this.age = age;
        else
            this.age = 18;
    }

    /**
     * 学生信息展示
     * 方法1 直接传参，
     * @param subjectname 专业名称
     * @param subjectyear 专业年限
     * @return 学生个人信息
     */

    public String info(String subjectname,int subjectyear) {
        String str = "学生信息如下：\n姓名：" + this.getName() + "\n学号:" + this.getId()
                + "\n性别：" + this.getGender() + "\n年龄:" + this.getAge() + "\n所报专业名称:"
                + subjectname + "\n学制年限：" + subjectyear;
        return str;
    }

    /**
     * 学生信息展示的方法
     * 方法2，将对象作为参数
     * @return 姓名，学号，性别，年龄
     */
    public String info(Subject mySubject) {
        String str = "学生信息如下：\n姓名：" + this.getName() + "\n学号:" + this.getId()
                + "\n性别：" + this.getGender() + "\n年龄:" + this.getAge() + "\n所报专业名称:"
                + mySubject.getName() + "\n学制年限：" + mySubject.getDuration();
        return str;
    }

    /**
     * 方法3 将Subject对象作为Student类的一个属性
     * @return
     */
    public String info() {
        String str = "学生信息如下：\n姓名：" + this.getName() + "\n学号:" + this.getId()
                + "\n性别：" + this.getGender() + "\n年龄:" + this.getAge() + "\n所报专业名称:"
                + this.getStudentSubject().getName() + "\n学制年限：" + this.getStudentSubject().getDuration();
        return str;
    }



}
