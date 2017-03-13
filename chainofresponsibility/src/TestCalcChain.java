import example1.*;

public class TestCalcChain {

    public static void main(String[] args) {

        // all of the objects in the chain

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        // Chaining all the items
        // Each object will forward the request to the next object when it can't process the request.
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        chainCalc1.calculate( new Numbers(4,2,"add"));
        System.out.println("\n");
        chainCalc2.calculate(new Numbers(10, 2, "mult"));
        System.out.println("\n");
        chainCalc4.calculate(new Numbers(14, 2, "div"));
    }
}
