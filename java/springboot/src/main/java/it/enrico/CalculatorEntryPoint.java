package it.enrico;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorEntryPoint {
    @Autowired
    private Calculator calculator;

    public EquationResult equation(String a, String b, String c) {
        return calculator.equation(Double.valueOf(a), Double.valueOf(b), Double.valueOf(c));
    }

    public void setCalculator(Calculator calculator) { this.calculator = calculator; }
}
