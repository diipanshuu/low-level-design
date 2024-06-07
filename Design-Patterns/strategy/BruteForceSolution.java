package strategy;

public class BruteForceSolution implements Solution{
    @Override
    public int[] rainwaterTrapped(int[] rainwater) {
        int n = rainwater.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int leftMax = rainwater[i];
            for (int j = i - 1; j >= 0; j--) {
                if (leftMax < rainwater[j]) {
                    leftMax = rainwater[j];
                }
            }

            int rightMax = rainwater[i];
            for (int j = i + 1; j < n; j++) {
                if (rightMax < rainwater[j]) {
                    rightMax = rainwater[j];
                }
            }

            result[i] = Math.min(leftMax, rightMax) - rainwater[i];
        }
        return result;
    }
}
