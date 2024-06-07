package strategy;

public class BetterSolution implements Solution{

    @Override
    public int[] rainwaterTrapped(int[] rainwater) {
        int n = rainwater.length;
        int[] result = new int[n];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = rainwater[0];
        rightMax[n - 1] = rainwater[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], rainwater[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], rainwater[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = Math.min(leftMax[i], rightMax[i]) - rainwater[i];
        }
        return result;
    }
}
