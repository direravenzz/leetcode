package twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],i);
            }
            int a=target-nums[i];
            if (hashMap.containsKey(a)){
                int g=hashMap.get(a);
                if(i!=g){
                    int[] b={g,i};
                    return b;
                }
            }

        }
        return null;
    }
}
