package it.enrico;

import javax.validation.constraints.NotNull;

public class Equation {
    @NotNull
    private Double a;
    @NotNull
    private Double b;
    @NotNull
    private Double c;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
