/**
 * Created by Bram on 14-2-2017.
 */
public class SellStock implements Order{
    private StockTrade firstStock;

    public SellStock(StockTrade s){
        this.firstStock = s;
    }

    public void execute() {
        firstStock.sell();
    }
}
