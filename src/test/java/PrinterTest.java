import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(1000, 40, 5, 1000);
    }

    @Test
    public void getSheets(){
        assertEquals(1000, printer.getSheets());
    }

    @Test
    public void getPages(){
        assertEquals(40, printer.getPages());
    }

    @Test
    public void getCopies(){
        assertEquals(5, printer.getCopies());
    }


    @Test
    public void getToner(){
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void pagesUsed(){
        assertEquals(800, printer.pagesUsed());
    }

    @Test
    public void lowPaper(){
        printer = new Printer(150, 40, 5, 800);
        assertEquals(false, printer.lowPaper());
    }

    @Test
    public void refill(){
        assertEquals(1000, printer.refill());
    }

    @Test
    public void decreaseToner(){
        assertEquals(800, printer.decreaseToner());
    }

}
