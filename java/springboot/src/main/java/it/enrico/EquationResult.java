package it.enrico;

import java.util.Set;

public class EquationResult {
    private Set<Integer> solutions;

    public EquationResult(Set<Integer> solutions) {
        this.solutions = solutions;
    }

    public void setSolutions(Set<Integer> solutions) {
        this.solutions = solutions;
    }

    public Set<Integer> getSolutions() {
        return solutions;
    }
}
