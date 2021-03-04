package com.imooc.sort;


import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        //按年龄排序
        int age1 = o1.getMonth();
        int age2 = o2.getMonth();
        return age2-age1;

    }
}
