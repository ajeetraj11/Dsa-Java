package ArraysProblems;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int arr[]){
        for (int i = arr.length-1 ; i>=0 ; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int a[]=new int[arr.length+1];
        a[0]=1;
        return a;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
