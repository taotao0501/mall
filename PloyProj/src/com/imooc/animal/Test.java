package com.imooc.animal;


public class Test {
    public static void main(String[] args) {
        Animal one=new Animal();
        /**
         * 向上转型、隐式转型、自动转型
         * 父类引用指向子类实例，可以调用子类重写父类的方法以及父类派生的方法，无法调用子类特有方法
         * 小型转大类
         * 注意：父类静态方法无法被子类重写，所以向上转型之后，只能调用到父类原有的静态方法，比如这里的say方法
         */
        Animal two=new Cat(); //向上转型 子→父
        Animal three=new Dog();

        two.say();

        Cat cat=(Cat) two;//想要调用子类的静态方法，应该将其向下转型即可
        cat.say();
//        two.setMonth(2);
//        two.getMonth();
//        one.eat();
//        two.eat();
//        three.eat();
        //two.run()
        //three.sleep();
        System.out.println("=============");

        /**
         * 向下转型、强制类型转换
         *子类引用指向父类对象，此处必须进行强转，可以调用子类特有的方法
         * 必须满足转型条件才能强转
         * instanceof 运算符：返回true/false，用来判断左侧对象是否满足右边类型的特征
         */
//        if(two instanceof Cat) {
//            Cat temp=(Cat)two;
//            temp.eat();
//            temp.run();
//            temp.setMonth(2);
//            System.out.println("two可以转换为Cat类型");
//        }

        if(two instanceof Dog) {
            Dog temp2=(Dog) two;
            temp2.eat();
            temp2.sleep();
            System.out.println("two可以转换为Dog类型");
        }

        if(two instanceof Animal) {
            System.out.println("two可以转换为Animal类型");
        }

        if(two instanceof Object) {
            System.out.println("two可以转换为Oject类型");
        }

        //
    }
}
