package zad3;

public interface ISubject {
    void register(IObserver o);
    void notifyObservers(Order order);
}
