package com.imooc.lambda;
@FunctionalInterface //通知编译器是函数式接口
public interface MathOperation {
    public Float operate(Integer a, Integer b);
}
