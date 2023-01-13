package Sorting.CyclicSort;

import java.util.Arrays;

public class lc268missingNumber {
    public static void main(String[] args) {
        int nums[] = {3, 0, 1, 2};
      int number =     missingNumber(nums);
        System.out.println(number);
    }

        public static int  missingNumber ( int[] nums){
            int n = nums.length;
            int i = 0, j;
            while (i < n) {
                int correct = nums[i];
                if (nums[i] == i || nums[i] >= n) {
                    i++;
                } else {
                    int t;
                    t = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = t;
                }
            }
            for(j = 0; j  < n; j++){
                if(nums[j] != j){
                    return j;
                }
            }
            return n;

        }
    }
