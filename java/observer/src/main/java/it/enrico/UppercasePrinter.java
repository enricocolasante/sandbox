package it.enrico;

public class UppercasePrinter implements Observer{

    @Override
    public void notify(String s) {
        System.out.println(s.toUpperCase());
    }
}

