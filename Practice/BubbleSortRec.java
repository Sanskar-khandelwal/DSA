package Practice;

import LeetcodeArrayQuestion.BubbleSort;

import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4};
        BS(nums, 4, 0);
    }

    public static void BS(int[] nums, int i, int j) {
        if(i == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
                if(j < i){
                    if(nums[j]  > nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                    BS(nums, i, j+1);
                }
                    else{
                        BS(nums, i -1, 0);
                    }


    }
}