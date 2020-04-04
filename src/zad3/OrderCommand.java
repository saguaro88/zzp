package zad3;

public class OrderCommand implements ICommand {
    private Order order;

    public OrderCommand(Order order){
        super();
        this.order = order;
    }
    @Override
    public void execute() {
        order.orderFood();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
