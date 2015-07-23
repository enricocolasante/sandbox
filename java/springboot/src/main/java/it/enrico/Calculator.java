package it.enrico;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public EquationResult equation(Integer a, Integer b, Integer c) {
        int delta = b*b-4*a*c;
        if (delta < 0)
            return new EquationResult(Sets.<Integer>newHashSet());
        else if (delta == 0)
            return new EquationResult(Sets.newHashSet(-b/(2*a)));
        else
            return new EquationResult(Sets.newHashSet((-b+delta)/(2*a),(-b-delta)/(2*a)));
    }
}
