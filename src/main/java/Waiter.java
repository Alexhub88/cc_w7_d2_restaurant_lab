public class Waiter {

    private String name;
    private double bumBagCash;
    private Order orderTaken;

    public Waiter(String name, double bumBagCash){
        this.name = name;
        this.bumBagCash = bumBagCash;
        this.orderTaken = null;
    }

    public String getName() {
        return name;
    }

    public double getBumBagCash() {
       return bumBagCash;
  }

    public Order getOrderTaken() {
        return orderTaken;
    }

    public void takeOrder(Order order){
        this.orderTaken = order;
    }


}
