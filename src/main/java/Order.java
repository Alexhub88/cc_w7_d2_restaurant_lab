public class Order {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;
    private int tableId;

    public Order(int quantity, MenuItem menuItem,int tableId){
        this.orderId = (int)(Math.random() * 10000.0);
        this.quantity = quantity;
        this.menuItem = menuItem;
        this.tableId = tableId;
    }



    public int getOrderId(){
        return this.orderId;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public MenuItem getMenuItem(){
        return this.menuItem;
    }

    public int getTableId() {
        return tableId;
    }
}
