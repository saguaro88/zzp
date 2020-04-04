package zad3;

import java.util.ArrayList;
import java.util.List;

public class Kiosk implements ISubject {
    private List<IObserver> observerList = new ArrayList<>();
    private IStrategy saleStrategy;
    public Kiosk() {
        this.saleStrategy = new NoPromotionStrategy();
    }

    public IStrategy getSaleStrategy() {
        return saleStrategy;
    }

    public void setSaleStrategy(IStrategy saleStrategy) {
        this.saleStrategy = saleStrategy;
    }
    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void notifyObservers(Order order) {
        for(IObserver observer : observerList){
                observer.update(order);
        }
    }
    public void makeOrder(OrderCommand orderCommand){
        saleStrategy.promotion(orderCommand.getOrder());
        orderCommand.execute();
        notifyObservers(orderCommand.getOrder());
    }
}
