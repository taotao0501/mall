package com.imooc.servlet.direct;

public class test {

    private static int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for (int num : nums) {
            if (num == maj)
                count += 1;
            else
                count -= 1;
            if (count == 0)
                maj = num;
        }
        return maj;
    }

    public static void main(String[] args) {
        int[] test = {2,2,1,1,1,2,2};
        
    }

}
