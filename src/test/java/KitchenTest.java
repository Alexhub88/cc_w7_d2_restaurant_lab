import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KitchenTest {

    Order order1;
    Waiter waiter1;
    Dish dish1;

    @Before
    public void before(){
        order1 = new Order(3, MenuItem.LATTE, 3);
        waiter1 = new Waiter("Jim", 100.00);
        dish1 = new Dish(order1);
    }

    @Test
    public void canKitchenTurnOrderIntoDish(){
        assertEquals(dish1.getClass(), Kitchen.takeOrderReturnDish(order1).getClass());

    }














}
