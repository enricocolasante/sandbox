package it.enrico;

public class Application {

    public static void main(String[] args) {
        Broker broker = new Broker();

        SimplePrinter simplePrinter = new SimplePrinter();
        LowercasePrinter lowercasePrinter = new LowercasePrinter();
        UppercasePrinter uppercasePrinter = new UppercasePrinter();

        broker.register(simplePrinter);
        broker.register(lowercasePrinter);
        broker.register(uppercasePrinter);
        broker.unregister(simplePrinter);

        broker.notifyObservers("Hello World!!!");
    }

}