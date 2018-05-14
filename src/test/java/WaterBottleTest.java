import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.volume);
    }

    @Test
    public void takeDrink(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterBottle.fill());
    }
}
