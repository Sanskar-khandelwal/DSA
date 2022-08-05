package LeetcodeArrayQuestion;

import javax.crypto.AEADBadTagException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestNumberAfterGivenNumber {
    public static void main(String[] args) {
  int[] nums = {4,3,2,1};
 List ans = countSmaller(nums);
        System.out.println(ans);

    }
    public static List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
int smallest = 0;
            int current = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] < current ) {
                    smallest++;
                }
            }
            arr.add(smallest);
        }
  return arr;
    }
}
