package RecusionSorting;

import java.util.Arrays;

public class Mergesort {
    
  public static void divide(int[] arr, int start, int end){
    
    
    if (start >= end) {
         return;
    }
    
    int mid = (start + end )/2;

    divide(arr, start, mid);
    divide(arr, mid +1, end);
    conquer(arr,start, mid, end);
    


  }






public static void conquer(int[] arr, int start, int mid, int end) {
   int[] merged = new int[end - start + 1];
   int i  = 0;
   int j = 0;
   int k = 0;
  

   while( i <= mid && j <= end){
         if(arr[i] <= arr[j]){
            merged[k++] = arr[i++];
         }
         else {
            merged[k++] = arr[j++];
         }
        }
        while(i <= mid ){
            merged[k++] = arr[i++];

        }
        while(j <= end ){
            merged[k++] = arr[j++];

        }

    arr= Arrays.copyOfRange(merged, 0, arr.length);
  


}






public static void main(String[] args) {
    int[] arr = {1,2,5,67,48,45,9};

    // int[] left = Arrays.copyOfRange(arr, 0, 3); // Here 3 is excluded 
    divide(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
}



}
