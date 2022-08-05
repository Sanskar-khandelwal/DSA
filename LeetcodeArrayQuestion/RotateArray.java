package LeetcodeArrayQuestion;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);

    }


        public static void rotate(int[] nums, int k) {
            while(k > 0){
  int temp = nums.length - 1;
                for(int i = nums.length -1; i >  0 ; i--){
                    nums[i] =  nums[i- 1];
                }
                nums[0] = temp;
                k--;
            }

        }
    }

