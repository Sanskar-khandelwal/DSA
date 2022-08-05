package LeetcodeArrayQuestion;

import java.util.ArrayList;
import java.util.List;

class Main {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        int max = -1;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);

        }
        return ans;
    }
}