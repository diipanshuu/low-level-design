package strategy;

public class BestSolution implements Solution{

    @Override
    public int[] rainwaterTrapped(int[] rainwater) {
        int n = rainwater.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int leftMax = rainwater[left], rightMax = rainwater[right];
        while (left <= right) {
            if (leftMax < rightMax) {
                if(rainwater[left] < leftMax){
                    result[left] = leftMax - rainwater[left];
                }else {
                    leftMax = rainwater[left];
                }
                left++;
            }else{
                if(rainwater[right] < rightMax){
                    result[right] = rightMax - rainwater[right];
                }else {
                    rightMax = rainwater[right];
                }
                right--;
            }
        }
        return result;
    }
}
