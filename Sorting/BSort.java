package Sorting;

import LeetcodeArrayQuestion.BubbleSort;

import java.util.Arrays;

public class BSort {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};

        BubbleSort(nums);
    }
    public static void BubbleSort(int[] nums){
        int t;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            boolean swapped = false;
            for (int j = 1; j < n-i-1; j++) {
                if(nums[j] < nums[j -1]){
                    t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                    swapped = true;
                }
            }
            if(swapped == false){
                System.out.println(Arrays.toString(nums));
                return;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
