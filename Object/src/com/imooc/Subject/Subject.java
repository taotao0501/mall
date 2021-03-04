package com.imooc.Subject;

/**
 * @author sbt
 * 写完后才发现这个其实可以都将其作为静态属性的
 */
public class Subject {
    // 成员属性：
    private String name;
    private String id;
    private int duration;
    private Student[] myStudents;
    private int studentNum;
    //无参构造方法 无论是否用到，先显式把这个写上
    public Subject(){

    }
    //带有名称，编号，学制年限的有参构造方法
    public Subject(String name,String id,int duration){
        this.setName(name);
        this.setId(id);
        this.setDuration(duration);
    }
    //带参构造，实现对所有属性的初始化
    public Subject(String name,String id,int duration,Student[] myStudents){
        this.setName(name);
        this.setId(id);
        this.setDuration(duration);
        this.setmyStudents(myStudents);
    }

    public Student[] getmyStudents() {
        if(this.myStudents == null)
            this.myStudents=new Student[200];
        return myStudents;
    }

    public void setmyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        if( duration >0)
            this.duration = duration;
        else
            System.out.println("学制年限设置错误：年限必须要大于0");
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    /**
     * 专业介绍方法
     * @return
     */
    public String info(){
        String str="专业信息如下：\n专业名称：" + this.name + "\n专业编号:" + this.id
                + "\n学制年限：" + this.duration + "年";
        return str;
    }

    public void addStudent(Student stu){
        /**
         * 1.将学生保存到数组中
         * 2.将学生个数保存到StudenNum
         */
        for(int i=0;i<this.getmyStudents().length;i++){
            if(this.getmyStudents()[i] == null){
                this.getmyStudents()[i] = stu;
                this.studentNum=i+1;
                return;
            }
        }
    }

}
