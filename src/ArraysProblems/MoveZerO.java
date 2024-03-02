package ArraysProblems;

import java.util.Arrays;

public class MoveZerO {
    public static void moveZero(int nums[]){
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }

        }
        while(count<nums.length){
            nums[count++]=0;
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        int nums[]={0,1,3,5,0,7,0};
        moveZero(nums);

    }
}
