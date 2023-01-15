package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class lc448DisappearedNum {
    public static void main(String[] args) {
        int nums[] = {1,1};
        findDisappearedNumbers(nums);
    }
    public static void findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> Numbers = new ArrayList<>();
          int n = nums.length;
            int i = 0, j;
            while (i < n) {
                int correct = nums[i] - 1;
                if (nums[i] == nums[correct] || nums[i] > n) {
                    i++;
                } else {
                    int t;
                    t = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = t;
                }
            }
            for(j = 0; j  < n; j++){
                if(nums[j] != j+1){
                 Numbers.add(j+1);
                }
            }
        System.out.println(Numbers);
    }
}