package com.imooc.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate函数式接口的使用方法
 */
public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer>  predicate = n->n>4; //判断test(Integer t)用来判断的
        boolean res = predicate.test(10);
        System.out.println(res);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        for(Integer num:list) {
//            if(num % 2 == 1) {
//                System.out.println(num);
//            }
//        }

        filter(list, n-> n % 2 == 1); //获得奇数
        filter(list, n-> n>5 && n % 2 ==0); //获得大于5的偶数
    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer num:list) {
            if(predicate.test(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}
