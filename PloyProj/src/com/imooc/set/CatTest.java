package com.imooc.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class CatTest {
    public static void main(String[] args) {

        Cat huahua = new Cat("花花",12,"短毛猫");
        Cat fanfan = new Cat("凡凡",4,"田园猫");

        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //暂时不写了，先看
    }
}
