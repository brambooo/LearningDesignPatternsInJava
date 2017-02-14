import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bram on 14-2-2017.
 * Invoker
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order o) {
        orderList.add(o);
    }

    public void placeOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
