package behavioural.templateMethod.model;

public class WebOrder extends OrderTemplate {

    @Override
    public void doCheckout() {
        System.out.println("get items from cart, ");
        System.out.println("set gift preferences, ");
        System.out.println("set delivery address, ");
        System.out.println("set billing address.");

    }

    @Override
    public void doPayment() {
        System.out.println("Process payment with Card present");

    }

    @Override
    public void doReceipt() {
        System.out.println("Email receipt");

    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item to the address");

    }
}
