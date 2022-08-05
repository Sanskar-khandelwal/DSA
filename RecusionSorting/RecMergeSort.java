package RecusionSorting;

import java.util.Arrays;

public class RecMergeSort {

//    public static int[] divides(int[] arr){
//        //base case
//        if (arr.length == 1 ){
//            return arr;
//        }
//
//        int mid = arr.length/ 2;
//
//       int[]  left = divides(Arrays.copyOfRange(arr,0,mid));
//      int[] right =  divides(Arrays.copyOfRange(arr,mid, arr.length));
//
//      return merge(left, right);
//
//    }

//    static int[] merge(int[] left, int[] right) {
//
//        int[] mix = new int[left.length + right.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i < left.length & j < right.length){
//            if(left[i] < right[j] ){
//                  mix[k++] = left[i++];
//             }
//            else{
//                mix[k++] = right[j++];
//            }
//        }
//        // It may be possible that one of the array is not complete add of the remaining elements
//
//        while( i < left.length){
//            mix[k] = left[i];
//            i++; k++;
//
//        }
//        while( j < right.length){
//            mix[k++] = right[j++];
//
//        }
//    return mix;
//    }
//
//


    //In Place Second approach
    public static void divide(int arr[], int start , int end ) {

        if(start >= end){
             return;
        }


        int mid = start + (end - start)/2;

        divide( arr, start, mid  );
        divide( arr, mid + 1, end   );
        conquer(arr, start, mid , end );

    }
    public static void conquer(int[] arr, int start, int mid, int end){
        int merged[] = new int[end - start +1];

        int indexOfFirst = start;
        int indexOfSecond = mid+1;
        int x = 0;


        while (indexOfFirst <= mid & indexOfSecond <= end ){
            if(arr[indexOfFirst] <= arr[indexOfSecond]){
                merged[x++] = arr[indexOfFirst++];
            }
            else {
                merged[x++] = arr[indexOfSecond++];
            }
        }
          while(indexOfFirst <= mid){
              merged[x++] = arr[indexOfFirst++];
          }

          while(indexOfSecond <=end){
              merged[x++] = arr[indexOfSecond++];
          }

//      arr =     Arrays.copyOf(merged, arr.length);
//
//        System.out.println(Arrays.toString(arr));
//
        for (int i = 0,j =start; i < merged.length; i++,j++) {
            arr[j] = merged[i];
        }
    }















    public static void main(String[] args) {
        int[] arr = {1,2,5,67,48,45,9};
        int n = arr.length;

    divide(arr, 0, n -1);

        System.out.println(Arrays.toString(arr));

    }
}



