package ArraysProblems;

public class RotateArray {
    public static void rotateArray(int arr[], int k){
        int n = arr.length;
        if(n==0)return;

        k=k%n;
        if(k==0)return;

        int temp[]= new int[k];

        for (int i =n-k; i < n; i++) {
            temp[i-(n-k)]=arr[i];
        }
        for (int i =n-k-1; i>=0 ; i--) {
            arr[i+k]=arr[i];
        }
        for (int i =0; i<k ; i++) {
            arr[i]= temp[i];
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        rotateArray(arr,k);
    }
}
