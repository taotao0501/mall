package com.imooc.sort;

import java.util.Comparator;

public class DogNameComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n=name1.compareTo(name2);
        return n;
    }
}
