public class Customer {

    private String name;
    private double wallet;
    private int table;
    private Dish dish;

    public Customer(String name, double wallet, int table){
        this.name = name;
        this.wallet = wallet;
        this.table = table;
        this.dish = null;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public int getTable() {
        return table;
    }

    public void pay(double cost){
        wallet -= cost;
    }

    public Order placeOrder(int quantity, MenuItem menuItem, int table){
        Order order = new Order( 1, MenuItem.LETTUCE, table);
        return order;
    }

    public void takeDishFromWaiter(Dish dishFromWaiter){
        dish = dishFromWaiter;
    }



    public void eatDish(){
        dish = null;
    }

}
