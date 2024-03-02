package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++ ){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] { map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int nums[]={2,3,6,8,9};
        int target=14;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
