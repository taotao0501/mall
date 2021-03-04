package com.imooc.people;

/**
 * 方法内部类的代码演示
 *
 */
public class people_Method_inClass {
    //方法内部类
    /*
    1.class 面前不能加public private protected static
    2.类中不能包含静态成员，但是可以包含final 和 abstract修饰成员
     */
        public static int age;

        public Object getHeart() {

            class Heart {
                public int age=13;
                int temp=23;

                public void say() {
                    System.out.println("Hello");
                }

                public void eat(){
                    System.out.println("内部类的人会吃东西");
                }

                public String beat() {
                    new Person().eat();
                    return people_Method_inClass.age + "心脏在跳动";
                }

            }
            return new Heart().beat();

        }

        public void eat() {
            System.out.println("人会吃东西");
        }

        public static int weight=23;

}
