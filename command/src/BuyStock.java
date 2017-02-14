/**
 * Created by Bram on 14-2-2017.
 */
public class BuyStock implements Order
{
    private StockTrade firstStock;

    public BuyStock(StockTrade s) {
        this.firstStock = s;
    }

    public void execute() {
        firstStock.buy();
    }
}
