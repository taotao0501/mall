package com.imooc.people;

public class Person {
    public static int age;
    public Object getHeart() {
//        new Heart().temp=12;
//        return new Heart();
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
                return Person.age + "心脏在跳动";
            }

        }
        return new Heart().beat();
    }

    public void eat() {
        System.out.println("人会吃东西");
    }

    public static int weight=23;
    /**
     * 成员内部类
     * 1.内部类在外部使用时，无法直接实例化，需要借由外部类信息
     * 2.访问修饰符可以任意，如果是默认的，那么只能在同包中可以使用，所有访问修饰符决定了内部类的访问范围
     * 3.内部类可以直接访问外部类的成员，如果出现同名属性，优先访问内部类中定义的
     * 4.可以使用外部类.this.成员的方式，访问外部类中同名的信息
     * 5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
     * 6.内部类编译后.class文件名：外部类$内部类.class

    class Heart {
        int age=13;
        int temp=23;
        public String beat() {
            Person.this.eat();
            return Person.this.age + "心脏在跳动";
        }

        public void eat(){
            System.out.println("内部类的人会吃东西");
        }
    }
     */

    //静态内部类
    /*
    1.静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
    2.静态内部类对象实例时，可以不依赖于外部类对象
    3.可以通过外部类.内部类.静态成员的方式，访问内部类中的静态成员
    4.当内部类属性于外部类属性同名时，默认直接调用内部类的成员；
      如果需要访问外部类中的静态属性，则可以通过外部类.属性 的方式；
      如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性 的方式;
    */
    /*
    static class Heart {
        int age=13;
        int temp=23;
        public String beat() {
            new Person().eat();
            return new Person().age + "心脏在跳动";
        }
        public int getWeight() {
            return weight;
        }

        public static void say() {
            System.out.println("Hello");
        }
    }

    */


}

