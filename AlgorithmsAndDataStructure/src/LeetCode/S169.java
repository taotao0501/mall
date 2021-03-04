package LeetCode;

import javax.sound.midi.Soundbank;

/**
 * 169 数组  摩尔投票法
 */
public class S169 {

    private S169(){};

    public static int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == maj)
                count++;
            else
                count--;
                if(count == 0)
                    maj = nums[i];
                    count = 1;

        }
        return maj;
    }

    public static void main(String[] args) {
        int[] test = {2,2,1,1,1,2,2};
        int[] test2 = {3,2,3};
        int res = S169.majorityElement(test);
        int res2 = S169.majorityElement(test2);
        System.out.println(res);
        System.out.println(res2);
    }

}
