package Practice;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {
  int[] nums = {2,5,1,3,4};
    SS(nums, 4, 0, 0);
    }
    public static void SS(int[] nums, int i, int j, int max){
        if(i == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        if(j< i){
            if(nums[j]  > max){
                max = nums[j];
                SS(nums, i , j+1, max);
            }
            else {
                SS(nums, i, j + 1, max);
            }
        }
        else{
            int temp;
            temp = nums[max];
            nums[i] = nums[max];
            nums[max] = nums[i];
            SS(nums, i-1, 0, max);
        }

    }}

