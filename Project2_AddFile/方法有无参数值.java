package Project2_AddFile;

public class 方法有无参数值 {
    public static void main(String[] args) {
        System.out.println(multipy(10, 20));
        print123();
    }

    public static int multipy(int a, int b) {
        int result = a*b;
        return result;
        // 
    }

    public static void print123 () {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }
}
