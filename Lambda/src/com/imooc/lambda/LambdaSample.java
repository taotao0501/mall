package com.imooc.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        //1.标准Lambda表达式

        //约束条件：Lambda表达式只能实现有且只有一个抽象方法的接口，Java称为“函数式接口”
        MathOperation addition = (Integer a, Integer b)->{
            System.out.println("加法运算");
            return a+b+0f;
        };

        System.out.println(addition.operate(4,5));

        //没用Lambda的操作
//        class Addition implements MathOperation{
//
//            @Override
//            public Float operate(Integer a, Integer b) {
//                return a+b+0f;
//            }
//        }

        //2.简洁版
        MathOperation multiplication = (a,b)->a*b+0f;
        System.out.println(multiplication.operate(5,3));
    }
}
