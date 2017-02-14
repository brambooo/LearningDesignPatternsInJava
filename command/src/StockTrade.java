/**
 * Created by Bram on 14-2-2017.
 * Request class
 */
public class StockTrade {
    private String name = "First stock";
    private int quantity = 10;

    public void buy(){
        System.out.println("StockTrade [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("StockTrade [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
