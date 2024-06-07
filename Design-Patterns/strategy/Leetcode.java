package strategy;

import java.util.Arrays;

import static strategy.Approach.*;

public class Leetcode {
    private static Solution solution;

    public Leetcode(Solution solution) {
        this.solution = solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public static void main(String[] args) {
        Leetcode leetcode = new Leetcode(SolutionFactory.getSolution(BEST));
        int[] rainwater = new int[]{1, 2, 4, 6, 9, 3, 5};

        assert solution != null;
        int[] result = solution.rainwaterTrapped(rainwater);
        System.out.println("Using Best approach " + Arrays.toString(result));
        // Using Better Solution
        leetcode.setSolution(new BetterSolution());
        result = solution.rainwaterTrapped(rainwater);
        System.out.println("Using Better approach " + Arrays.toString(result));
        // Using BruteForce Solution
        leetcode.setSolution(SolutionFactory.getSolution(BRUTE));
        result = solution.rainwaterTrapped(rainwater);
        System.out.println("Using Brute approach " + Arrays.toString(result));
    }
}
