package example1;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        // Create the example1.Subject object
        // Handle adding/deleting/updating/ Observers
        StockObject stockObject = new StockObject();

        // Create example1.Observer that will be sent updates from example1.Subject

        StockObserver observer1 = new StockObserver(stockObject);

        stockObject.setAAPLPrice(500.50);
//        stockObject.setAAPLPrice(100);
//        stockObject.setAAPLPrice(50.50);

    }
}
