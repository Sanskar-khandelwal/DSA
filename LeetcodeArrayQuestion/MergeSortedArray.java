package LeetcodeArrayQuestion;

import java.util.Arrays;

class MergeSortedArray {

    public static void main(String[] args) {
     int[] nums1 =    {1,2,3,0,0,0};
       int m =  3;
      int[] nums2 =           {2,5,6};
     int n =    3;
     merge(nums1, m , nums2, n);
    }
    
    
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] num3 = new int[m +n];
        int i = 0;
        int j = 0;
        int k = 0;
        
        
    while(i < m &&  j<  n){
     if(nums1[i] < nums2[j]){
              num3[k++]  = nums1[i++];
     }
        else{
//          int temp = nums1[i];
//          nums1[i] = nums2[j];
//            nums2[j] = nums1[i];
//            i+=1;
         num3[k++] = nums2[j++];
        }


    }

        while(i <  m ){
//          nums1[i] = nums2[j];
//            i++;
//            j++;
            num3[k++]  = nums1[i++];
        }


        while(j <  n ){
//          nums1[i] = nums2[j];
//            i++;
//            j++;
            num3[k++]  = nums2[j++];
        }
        System.out.println(Arrays.toString(num3));

        for(int x = 0, y = 0; x < m + n; x++, y++){
            nums1[y] = num3[x];
        }






    }
}