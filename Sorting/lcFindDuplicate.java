package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

class lcFindDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,3,4,4
                ,2};
        int number = findDuplicate(nums);
        System.out.println(number);
    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        int t;
        while(i < n){
            int correct = nums[i] - 1;
           if(nums[i] == nums[correct]){
               i++;
           } 
           else{
              t = nums[i];
              nums[i] = nums[correct];
              nums[correct] = t; 
           }
        }
        System.out.println(Arrays.toString(nums));
     return nums[n-1] ;
    }
}