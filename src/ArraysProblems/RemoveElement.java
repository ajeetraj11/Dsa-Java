package ArraysProblems;

public class RemoveElement {

    public static int removeElement(int arr[] , int k){
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=k){
                arr[count]=arr[i];
                count++;
            }


        }

     return count ;
    }

    //TODO: Remove Duplicates

    public static int removeDuplicates(int arr[]){
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j]!=arr[i]){
                arr[j]=arr[i];
                j++;
            }

        }
        return j;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,3,4,5};
        int k=3;
        System.out.println(removeElement(arr, k));
        System.out.println(removeDuplicates(arr));
    }
}
