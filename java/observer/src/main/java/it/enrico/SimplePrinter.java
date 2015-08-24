package it.enrico;

public class SimplePrinter implements Observer{

    @Override
    public void notify(String s) {
        System.out.println(s);
    }
}
