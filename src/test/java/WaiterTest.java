import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    private Waiter waiter1;
    private Order order1;

    @Before
    public void before() {
        waiter1 = new Waiter("Todd", 100.00);
        order1 = new Order(2, 1, MenuItem.LASAGNE, 4);
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

}