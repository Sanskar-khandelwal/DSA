package LeetcodeArrayQuestion;

import java.util.Arrays;

class RotateArraybyKth {
    public static  void reverse(int[] nums, int l , int r){
        while(r >= l){
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    

    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
    reverse(nums, 0 , n - k - 1);
      reverse(nums, n-k+1, n-1);
   
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5, 6, 7};
        int k = 3;
        rotate(nums, k );
        System.out.println(Arrays.toString(nums));


    }
}