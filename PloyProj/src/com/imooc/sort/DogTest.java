package com.imooc.sort;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class DogTest {
    public static void main(String[] args) {
        Dog huahua = new Dog("huahua",4,"藏獒");
        Dog lala = new Dog("lala",5,"拉布拉多");
        Dog haha = new Dog("haha",8,"哈士奇");

        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(huahua);
        dogList.add(lala);
        dogList.add(haha);

        //排序前：
//        System.out.println("排序前：");
//        Iterator<Dog> dogIt = dogList.iterator();
//        while (dogIt.hasNext()) {
//            System.out.println(dogIt.next());
//        }
        //排序前
        for(Dog dog:dogList) {
            System.out.println(dog);
        }

        //按年龄降序排序
        Collections.sort(dogList, new DogAgeComparator());
        System.out.println("按年龄升序排序后：");
        for(Dog dog:dogList){
            System.out.println(dog);
        }

        //按姓名升序排序
        Collections.sort(dogList, new DogNameComparator());
        System.out.println("按名字升序排序后：");
        for(Dog dog:dogList){
            System.out.println(dog);
        }

    }
}
