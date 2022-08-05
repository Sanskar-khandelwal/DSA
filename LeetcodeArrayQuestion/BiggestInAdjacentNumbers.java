package LeetcodeArrayQuestion;

import java.util.Arrays;

public class BiggestInAdjacentNumbers {
    public static void main(String[] args) {
    int[] nums = {2,2,456,32,1,56,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0, j = 1;
        while(i < nums.length){
            sum1 = sum1 + nums[i];
            i= i+2;
        }
        while(j < nums.length){
            sum2 = sum2 + nums[j];
            j= j+2;
        }
        if(sum1 > sum2){
            return sum1;
        }
        else return sum2;

    }
}
