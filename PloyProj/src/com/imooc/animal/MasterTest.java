package com.imooc.animal;

public class MasterTest {
    public static void main(String[] args) {
        Master master=new Master();
        Cat cat=new Cat();
        Dog dog=new Dog();
        master.feed(cat);
        master.feed(dog);
        System.out.println("================");
        boolean isManyTime=true;
        Animal temp=master.raise(isManyTime);
        System.out.println(temp);
    }
}
