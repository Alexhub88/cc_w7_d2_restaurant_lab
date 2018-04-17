import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class OrderTest {

    Order order1;

    @Before
    public void before() {
        order1 = new Order( 3, MenuItem.LATTE, 3);
    }

    @Test
    public void hasOrderId(){
        assertTrue( order1.getOrderId() < 10000 && order1.getOrderId() > 0);
    }

    @Test
    public void hasQuantity(){
        assertEquals(3, order1.getQuantity());
    }

     @Test
    public void hasMenuItem(){
        assertEquals(MenuItem.LATTE, order1.getMenuItem());
    }





}
