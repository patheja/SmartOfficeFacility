import java.util.Stack;

public class Waiter {
    private Stack<OrderCommand> orderHistory = new Stack<>();

    public void takeOrder(OrderCommand command) {
        command.execute();
        orderHistory.push(command);
    }

    public void undoLastOrder() {
        if (!orderHistory.isEmpty()) {
            OrderCommand lastOrder = orderHistory.pop();
            lastOrder.undo();
        }
    }
}