package strategy;

import java.util.Arrays;

import static strategy.Approach.*;

public class Leetcode {
    public static void main(String[] args) {
        int[] rainwater = new int[]{1, 2, 4, 6, 9, 3, 5};
        
        Solution solution = SolutionFactory.getSolution(BEST);
        assert solution != null;
        int[] result = solution.rainwaterTrapped(rainwater);
        System.out.println(Arrays.toString(result));
    }
}
