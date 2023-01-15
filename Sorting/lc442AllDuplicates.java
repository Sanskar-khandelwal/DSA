package Sorting;

import java.util.ArrayList;
import java.util.List;

class lc442AllDuplicates {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums)); ;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i=0, j, t;

        int n = nums.length;
       ArrayList<Integer> Numbers = new ArrayList<>();
    
        while(i < n){
            int correct = nums[i] -1;
            if(nums[i] == nums[correct]){
                i++;
            }
        
        else{
            t = nums[i];
            nums[i] = nums[correct];
            nums[correct] = t;
        }
        }

        for(j = 0; j < n; j++){
               if(nums[j] != j+1){
                   Numbers.add(nums[j]);
               }
        }
        return Numbers;
    }
}