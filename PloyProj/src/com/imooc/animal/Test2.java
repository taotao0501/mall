package com.imooc.animal;

public class Test2 {
    public static void main(String[] args) {
        Animal animal=new Animal();

        //向上转型，自动转型，子类转父类
        Animal cat=new Cat(); //父类引用指向子类对象
        Animal dog=new Dog(); //父类引用指向子类对象

        /**
         * 转型后只能调用父类的派生方法如 setName,以及子类重写的方法，子类特有的无法调用
         */
        animal.eat(); // 动物都有吃东西的能力
        cat.eat(); // 猫吃鱼~~~！
        cat.say(); // 小动物之间打招呼
        dog.eat(); // 狗吃肉~~~！
        cat.setName("kitty");
        System.out.println(cat.getName());
        System.out.println("=================");

        //如果想要调用 子类特有的成员属性和方法怎么办呢？ 再转回来
        /**
         * 向下转型（强制转型）,子类引用指向父类对象，必须强转
         * 可以调用子类特有的方法
         */
        Cat re_cat = (Cat) cat;
        re_cat.run();
        re_cat.eat();

        Dog re_dog = (Dog) dog;
        re_dog.sleep();
        re_dog.eat();
        System.out.println("====================");
        /**
         * 在强转的过程中，转换的右边即父类对象一定是之前经过向上转型得到的，原本就是子类对象，必须满足这个强转条件
         * instanceof 可以帮助判断 左边对象是否满足右边类的特性，是 就可以强转,下面重写上面 强转代码
         */
        if(cat instanceof Cat) {
            Cat re_cat2 = (Cat) cat;
            re_cat2.run();
            re_cat2.eat();
            re_cat2.say();
        }

        if(dog instanceof Dog) {
            Dog re_dog2 = (Dog) dog;
            re_dog2.sleep();
            re_dog2.eat();
        }

        if(animal instanceof Cat) {
            Cat animal_cat = (Cat) animal;

        } else {
            System.out.println("animal不是Cat类");
        }

    }
}
