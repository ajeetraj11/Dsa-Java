package LeetCode;

import java.util.Arrays;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
    int start=0;
    int end= n-1;
    while(start<end){
        int sum=numbers[start]+numbers[end];

        if(sum<target) {
            start++;
        }else if(sum>target){
            end--;
        }else{
            return new int[] {start+1,end+1};
        }
    }
    return new int[] {};

}

    public static void main(String[] args) {
        int numbers[]={2,3,6,8,9};
        int target=14;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
