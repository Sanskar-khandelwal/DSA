package RecusionSorting;

import java.util.Arrays;

public class BubbleSRec {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1};
        RecSortB(nums, nums.length, 0);
    }

    private static void RecSortB(int[] nums, int n , int  i) {
        boolean swapped = false;
        if(i == n -1){
            System.out.println(Arrays.toString(nums));
            return;
        }
        for (int j = 0; j < n -i -1; j++) {
            int t;
            if(nums[j] > nums[j+1]){
                t = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = t;
                swapped = true;
            }
        }
        if(swapped == false){
            System.out.println(Arrays.toString(nums));
            return;
        }

        RecSortB(nums, n , i+1);
    }
}
