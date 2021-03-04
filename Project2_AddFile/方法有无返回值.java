package Project2_AddFile;

public class 方法有无返回值 {
    public static void main(String[] args) {
        int num1 = getSum(1, 4);
        System.out.println(num1);
        printSum(2, 5);
    }
    
    public static int getSum(int a, int b) {
        int res = a + b;
        return res;
    }

    public static void printSum(int a, int b) {
        int res = a + b;
        System.out.println("结果是" + res);
    }
}
