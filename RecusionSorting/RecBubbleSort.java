package RecusionSorting;

import java.util.Arrays;

public class RecBubbleSort {
    public static void main(String[] args) {
  int[] nums = {5,4,3,2,1};

            Bubble(4,1, nums);
        System.out.println(Arrays.toString(nums));

    }

   static void Bubble(int i, int j,int[] arr) {
        if(i == 0) {
            return;
        }

        if(j <= i ){
            if(arr[j] < arr[j -1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j-1] = temp;
            }
            Bubble(i, j +1, arr);
        }
        else Bubble(i -1 , 1, arr);
    }


}
