package ArraysProblems;

import java.util.Arrays;

public class SecondLargest {
        public static int getSecondOrderElements(int n, int []a) {
            // Write your code here.
            int largest=a[0];
            int sLargest=Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                if(a[i]>largest){
                    sLargest=largest;
                    largest=a[i];
                }
                else if(a[i]<largest && a[i]>sLargest){
                    sLargest=a[i];
                }

            }
            return sLargest;
        }

    public static void main(String[] args) {
        int [] arr = {1,2,5,8,9,6};
        int n= arr.length;
        System.out.println(getSecondOrderElements(n,arr));
    }
    }

