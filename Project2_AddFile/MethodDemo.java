package Project2_AddFile;
/**
 * 一个Java源文件只能有一个public类，而且这个类里面肯定包括main方法
 */
public class MethodDemo {
    public void printStar() {
        System.out.print("*****************");
    }
    public static void main(String[] args){
        MethodDemo myMethodDemo = new MethodDemo();
        myMethodDemo.printStar();
        System.out.println("\nWelcome to Java's World!");
        myMethodDemo.printStar();
    }
}