package it.enrico;

public class LowercasePrinter implements Observer{

    @Override
    public void notify(String s) {
        System.out.println(s.toLowerCase());
    }
}