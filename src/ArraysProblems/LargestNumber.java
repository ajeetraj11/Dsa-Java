package ArraysProblems;

import java.util.Scanner;

public class LargestNumber {
    public static int getLargest(int numbers[]){
        int largest =Integer.MIN_VALUE;// -infinity value
        int smallest =Integer.MAX_VALUE;// infinity

        for (int i = 0; i < numbers.length; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if (smallest> numbers[i]) {
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers =new int[5];
        System.out.println("Enter Array of length 5: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=sc.nextInt();
        }
        System.out.println(getLargest(numbers));
    }
}
