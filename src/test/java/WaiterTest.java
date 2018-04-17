import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class WaiterTest {

    private Waiter waiter1;
    private Order order1;
    private Customer customer1;

    @Before
    public void before() {
        waiter1 = new Waiter("Todd", 100.00);
        order1 = new Order(21, MenuItem.LASAGNE, 4);
        customer1 = new Customer("Rodd", 100, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Todd", waiter1.getName());
    }

    @Test
    public void hasBumBagCash() {
        assertEquals(100d, waiter1.getBumBagCash(), 0.01);
    }

    @Test
    public void waiterStartsWithNoOrder(){
        assertEquals(null, waiter1.getOrderTaken());
    }

    @Test
    public void waiterCanTakeOrder() {
        waiter1.takeOrder(order1);
        assertEquals(order1, waiter1.getOrderTaken());
    }

    @Test
    public void waiterCanReceiveDishFromKitchen() {
        waiter1.getDishFromKitchen();
        assertNotNull(waiter1.getDish());
    }

    @Test
    public void waiterCanServeDish() {
        waiter1.getDishFromKitchen();
        waiter1.serveDishToCustomer(customer1);
        assertNull(waiter1.getDish());

    }




}