package Project3_循环条件语句使用;

public class traverse {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i <10; i++){
            a[i] = i;
        }
        // for each
        for (int ele:a)
        System.out.println(ele);

        /*
        for(int i; i < a.length; i++){
            System.out.println(a[i]);
        }
        */
    }
}
