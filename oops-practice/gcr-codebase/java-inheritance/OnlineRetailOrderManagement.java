class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String date) {
        this.orderId = orderId;
        this.orderDate = date;
    }
}
// subclass of Order (child)
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String date, String trackingNumber) {
        super(orderId, date);
        this.trackingNumber = trackingNumber;
    }
}
// subclass of ShippedOrder -> show multilevel Inheritance
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String date, String trackingNumber, String deliveryDate) {
        super(orderId, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus(){
        System.out.println();
        System.out.println("Order ID: " + orderId + ", Delivered on: " + deliveryDate +" Ordered Date is: "+ orderDate);
    }
}
// main class
// Example of multilevel inheritance
public class OnlineRetailOrderManagement{
    public static void main(String[] args){
        DeliveredOrder d = new DeliveredOrder(1, "26-12-2026", "4546", "2021-01-02");
        d.getOrderStatus();
    }
}
