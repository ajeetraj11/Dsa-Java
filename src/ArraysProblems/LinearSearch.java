package ArraysProblems;

import java.util.*;

public class LinearSearch {
    public  static int linear(int arr[] , int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,9,4,10,8,6,7,7};
        int key = 10;

        int index = linear(arr , key);

        if (index==-1){
            System.out.println("NOT FOUND");
        }else {
            System.out.println("Key is at Index: "+index);
        }
    }
}
