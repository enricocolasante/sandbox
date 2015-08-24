package it.enrico;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class Broker {
    private List<Observer> observers = Lists.newArrayList();

    public void register(Observer observer) {
        this.observers.add(observer);
    }
    public void unregister(Observer observer) {this.observers.remove(observer);}
    public void notifyObservers(final String message){this.observers.stream().forEach((o) -> o.notify(message));}
}
