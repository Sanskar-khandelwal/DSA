package RecusionSorting;

import java.util.Arrays;

public class RecSelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

        Bubble(4,0, nums, -1);
        System.out.println(Arrays.toString(nums));

    }

    static void Bubble(int i, int j,int[] arr, int max) {
        if(i == 0) {

            return;
        }

        if(j <= i ){
            if(max < arr[j]){
                 max = arr[j];
                 Bubble(i , j + 1, arr, max);
            }
             int temp = arr[j];
            arr[i] = max;
            arr[j] = temp;

        }
        else Bubble(i -1 , 0, arr, 0);
    }


}
