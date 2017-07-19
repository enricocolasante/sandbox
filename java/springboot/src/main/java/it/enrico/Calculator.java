package it.enrico;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public EquationResult equation(Double a, Double b, Double c) {
        if(a==0) {
            return new EquationResult(Sets.newHashSet(-c/b));
        }
        if(c==0) {
            return new EquationResult(Sets.newHashSet(-b/a,0.0));
        }
        double delta = b*b-4*a*c;
        if (delta < 0)
            return new EquationResult(Sets.<Double>newHashSet());
        else if (delta == 0)
            return new EquationResult(Sets.newHashSet(-b/(2*a)));
        else
            return new EquationResult(Sets.newHashSet((-b+delta)/(2*a),(-b-delta)/(2*a)));
    }
}
