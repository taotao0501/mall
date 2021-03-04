package Project1_基本类型使用;
// 数据类型
// 整型 int short long byte; 浮点 float double; char "AA"; boolean
// 常量 final

/*1.多个变量，变量不能重复
  2.对于float和long ,字母后缀不能丢
  3.如果使用byte或者short，数值要在范围内
  4.变量一定要初始化才能使用
  5.变量的使用不能超出作用域的范围 作用域：大括号的范围
  6.可以通过一个语句创建多个变量，但是不推荐
 */
public class Use_variable {
    public static void main(String[] args){
        int num1 = 10;
        short num5 = 400;
        long num6 = 20000L;
        byte num7 = 127; // -128~ 127
        System.out.println(num1);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        
        float num9 = 3.4F;
        double num10 = 2.99; //默认为 double
        System.out.println(num10);
        System.out.println(num9);

        char zimu = 'A';
        String ZIMU = "strings";
        System.out.println(zimu);
        System.out.println(ZIMU);
    }
}