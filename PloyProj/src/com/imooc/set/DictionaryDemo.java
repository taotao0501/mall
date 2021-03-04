package com.imooc.set;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<String,String>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");

        //添加数据
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值（单词）： ");
            String key = console.next();

            System.out.println("请输入value值（解释）： ");
            String value = console.next();
            animal.put(key, value);

            i++;
        }
        System.out.println("===================");

        //打印输出所有value值
        System.out.println("使用迭代器输出所有的value: ");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + "   ");
        }
        System.out.println();
        System.out.println("====================");

        //打印输出 key 和 value 的值,通过entrySet()方法
        //键值对存储为 Set 类型为 Entry<String,String>
        Set<Entry<String,String>> entrySet = animal.entrySet();
        for (Entry<String,String> entry:entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();
        System.out.println("======================");

        // 这里好像不用了 Iterator
//        Iterator<Entry<String,String>> entrys = entrySet.iterator();
//        while (entry.hasNext()) {
//            System.out.println(entrys);
//        }
        //通过单词查找对应的
        System.out.println("请输入检索的单词：");
        String strSearch = console.next();

        //这个是比较傻的办法
        for (Entry<String,String> entry:entrySet) {
            if (strSearch.equals(entry.getKey())) {
                System.out.println(strSearch + "对应的解释是" + entry.getValue());
                return;
            } else {
                System.out.println("没有对应的单词的解释");
            }
        }

        //使用get()方法得到key 对应的 value
        Set<String> keySet = animal.keySet();
        for (String key:keySet) {
            if (strSearch.equals(key)) {
                System.out.println("找到了！键值对为："+key+"-"+animal.get(key));
            }
        }
    }
}
