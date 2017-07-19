package it.enrico;

import java.util.Set;

public class EquationResult {
    private Set<Double> solutions;

    public EquationResult(Set<Double> solutions) {
        this.solutions = solutions;
    }

    public void setSolutions(Set<Double> solutions) {
        this.solutions = solutions;
    }

    public Set<Double> getSolutions() {
        return solutions;
    }
}
