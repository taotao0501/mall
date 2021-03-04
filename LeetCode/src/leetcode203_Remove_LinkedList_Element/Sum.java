package leetcode203_Remove_LinkedList_Element;

/**
 * 使用递归思想来求和数组
 */
public class Sum {
    //用户使用
    private static int sum(int[] arr) {
        return sum(arr,0);
    }

    private static int sum(int[] arr, int l){
        if(l == arr.length)
            return 0;
        return arr[l] + sum(arr,l+1);

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(sum(nums));
    }
}
