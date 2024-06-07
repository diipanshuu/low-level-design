package strategy;

public class SolutionFactory {
    public static Solution getSolution(Approach strategy) {
        if(strategy == Approach.BRUTE){
            return new BruteForceSolution();
        } else if (strategy == Approach.BETTER) {
            return new BetterSolution();
        } else if (strategy == Approach.BEST) {
            return new BestSolution();
        }
        return null;
    }
}
