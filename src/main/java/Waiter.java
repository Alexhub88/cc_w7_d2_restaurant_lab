public class Waiter {

    private String name;
    private double bumBagCash;
    private Order orderTaken;
    private Dish dish;


    public Waiter(String name, double bumBagCash){
        this.name = name;
        this.bumBagCash = bumBagCash;
        this.orderTaken = null;
        this.dish = null;
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

    public void getDishFromKitchen(){
       dish =  Kitchen.takeOrderReturnDish(orderTaken);
    }

    public void serveDishToCustomer(Customer customer){
        customer.takeDishFromWaiter(dish);
        dish = null;
    }

    public Dish getDish() {
        return dish;
    }
}
