public class Dish {


    Order orderFromWaiter;


    public Dish(Order orderFromWaiter) {
        this.orderFromWaiter = orderFromWaiter;
    }

    public Order getOrderFromWaiter(){
        return orderFromWaiter;
    }


}
