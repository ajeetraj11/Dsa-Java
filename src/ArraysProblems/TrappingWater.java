package ArraysProblems;

public class TrappingWater {
    public static int trappingWater(int[] height){
        int n = height.length;
        int leftmax[]= new int[n];
        int rightmax[]= new int[n];
        int max=0, totalwater=0;

        for (int i = 0; i <n ; i++) {
            max= Math.max(max, height[i]);
            leftmax[i]=max;
        }

        max = 0;

        for (int i = n-1; i >=0 ; i--) {
            max= Math.max(max, height[i]);
            rightmax[i]=max;
        }
        for (int i = n-1; i >=0 ; i--) {
           int water=Math.min(rightmax[i],leftmax[i])-height[i];
           totalwater +=water;
        }
        return totalwater;
    }

    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        System.out.println(trappingWater(height));
    }
}
