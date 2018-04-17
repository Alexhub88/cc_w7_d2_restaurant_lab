import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class DishTest {

    Order order1;
    Dish dish1;

    @Before
    public void before(){
        order1 = new Order(7, 3, MenuItem.LATTE, 3);
        dish1 = new Dish(order1);
    }

    @Test
    public void canGetDishName(){
        assertEquals("Latte", dish1.getOrderFromWaiter().getMenuItem().getName());
    }

}
