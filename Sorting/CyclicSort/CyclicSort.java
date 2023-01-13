package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int arr[] = {1,2,3,5,4,6};
       int n = arr.length;
       int i = 0;
   while( i < n){
       int correct = arr[i] -1;
       if(arr[i] == i+1){
           i++;
       }else{
           int t;
           // I am swaping arr[i] ko arr[i]-1
           t = arr[i];
           arr[i] = arr[correct];
           arr[correct] = t;
        }
   }
        System.out.println(Arrays.toString(arr));
    }


}
