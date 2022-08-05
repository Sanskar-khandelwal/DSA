package LeetcodeArrayQuestion;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {8,5,3,1,6,1,0,6,0};

        sort(nums);
    }

    public static void sort(int[] nums) {
        int temp = 0;
      boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i ; j++) {
                if(nums[j] < nums[j-1]) {
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
                 if(!swapped)  break;
        }
    }
}
