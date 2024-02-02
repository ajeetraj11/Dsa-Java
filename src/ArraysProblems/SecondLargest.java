package ArraysProblems;

public class SecondLargest {
        public static int[] getSecondOrderElements(int n, int []a) {
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
            int[] result={sLargest};
            return result ;
        }

    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(getSecondOrderElements(6,arr));
    }
    }

