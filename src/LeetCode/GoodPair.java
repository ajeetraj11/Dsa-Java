package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class GoodPair {
    public static int goodPair(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for (int num:nums) {
            result+=map.getOrDefault(num,0);
            map.put(num,map.getOrDefault(num,0)+1);

        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,1,1,1,4};
        System.out.println(goodPair(nums));
    }
}
