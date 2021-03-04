package com.imooc.set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ColorDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");

        System.out.println("集合中的元素为：");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "   ");
        }

        System.out.println("==================");
        set.add("green");
        set.add("white");

        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "   ");
        }

        //set是无序，无重复
    }

}
