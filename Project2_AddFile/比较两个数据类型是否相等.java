package Project2_AddFile;

public class 比较两个数据类型是否相等 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;

        long c = 30L;
        long d = 30;

        System.out.println(isSame(c, d));
    }
    
    public static boolean isSame(byte a, byte b) {
        System.out.println("byte执行");
        boolean same;
        if( a == b){
            same = true;
        }
        else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short执行");
        boolean same = a == b? true:false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int执行");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long执行");
        if( a == b){
            return true;
        }
        else{
            return false;
        }
    }
}
