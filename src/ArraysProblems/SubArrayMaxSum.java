package ArraysProblems;

public class SubArrayMaxSum {


    public static void maxSubArraySum(int num[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
       for (int i = 0; i <num.length ; i++) {
        for (int j =i; j < num.length ; j++) {
            curr = 0;
            for (int k = i; k <= j; k++) {
                System.out.print(num[k] + " ");
                curr +=num[k];
            }
            System.out.println("= " + curr);
            if (max < curr) {
                max = curr;
            }
        }
    }
        System.out.println( "Maximum Sum: " +max );
    }


    //.......................Todo: prefix Method.....................................


        public static void prefixSubArraySum(int num[]){
            int curr=0;
            int max=Integer.MIN_VALUE;
            int prefix[]=new int [num.length];

            prefix[0]=num[0];
            for (int i = 1; i < prefix.length ; i++) {
                prefix[i]=prefix[i-1]+num[i];
            }

            for (int i = 0; i <num.length ; i++) {
                for (int j = i; j < num.length; j++) {
                    curr = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                    if (max < curr) {
                        max = curr;
                    }
                }
            }
        System.out.println( "Maximum Sum: " +max );
}


// Todo:........................KADANE'S.....................................


    public static void kadane(int num[]){
        int cs =0;
        int ms= Integer.MIN_VALUE;
        for (int i = 0; i <num.length ; i++) {
            cs= cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs , ms);

        }
        System.out.println("Maximum sum : "+ms);
    }



    // TODO.....................main method ......................................



public static void main(String[] args) {
    int num[]={2,4,6,8,10};
    maxSubArraySum(num);
    prefixSubArraySum(num);
    kadane(num);
}
}
