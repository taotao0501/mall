package 数组;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for(int i=0; i<10; i++)
            arr.addLast(i);
        System.out.println(arr.get(10));
//        arr.add(100,1);
//        arr.addFirst(12);
//        System.out.println(arr);
//        arr.remove(0);
//        System.out.println(arr);
//
//        int t1 = 2;
//        Integer t2 = t1;
//        String t3 = t2.toString();
//
//        int t4 = Integer.parseInt(t3);
//        int t5 = Integer.valueOf(t2);
    }
}
