package ArraysProblems;

public class BinarySearch {

    public static int getNumber(int number[], int key){
        int start=0;
        int end = number.length;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (number[mid]==key) {
                return mid;
            }
            if ( number[mid]>key) {
                end=mid-1;
            }else{
                start=mid+1;
            }


        }
         return -1;
        }


    public static void main(String[] args) {
        int number[] = {1, 5, 7, 9, 12, 18};
        int key = 18;

        int index = getNumber(number, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at Index: "+index);
        }
    }
}
