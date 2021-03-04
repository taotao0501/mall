package com.imooc.anonymous;

public class PersonTest {
    //根据传入的不同的人的类型，调用对应的read方法
    //方案1
//    public void getRead(Man man) {
//        man.read();
//    }
//
//    public void getRead(Woman woman) {
//        woman.read();
//    }

    //方案2
    public void getRead(Person person) {
        person.read();
    }

    public static void main(String[] args) {
        PersonTest test=new PersonTest();
//        Man one=new Man();
//        Woman two=new Woman();
//        test.getRead(one);
//        test.getRead(two);
        // 方案3，现场调用现场写，匿名内部类
        /*
        1.匿名内部类没有类型名称、实例对象名称；
        2.编译后的文件命名：外部类$数字.class;
        3.无法使用 private public protected abstract static 修饰
        4.无法编写构造方法，不能出现静态成员，匿名内部类可以实现接口，也可以继承父类，但是不可兼得
         */
        test.getRead(new Person(){
            @Override
            public void read() {
                System.out.println("男生喜欢看科幻类书籍");
            }
        });

        test.getRead(new Person(){
            @Override
            public void read() {
                System.out.println("女人喜欢看言情小说");
            }
        });
    }
}
