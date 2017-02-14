/**
 * Created by Bram on 14-2-2017.
 */
public class Demo {
    public static void main(String[] args) {
        StockTrade firstStock = new StockTrade();

        BuyStock buyStockOrder = new BuyStock(firstStock);
        SellStock sellStockOrder = new SellStock(firstStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

    }
}
