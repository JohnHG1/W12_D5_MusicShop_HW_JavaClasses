import instruments.Brass.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void setUp() {
        saxaphone = new Saxaphone("Sony", "Alto Saxaphone",  655.50, 917.70, "Brass");
    }

    @Test
    public void getManufacturer() {
        assertEquals("Sony", saxaphone.getManufacturer());
    }

    @Test
    public void getInstrumentType(){
        assertEquals("Alto Saxaphone", saxaphone.getInstrumentType());
    }

    @Test
    public void getRetailPrice(){
        assertEquals(655.50, saxaphone.getRetailPrice(), 0.001);
    }

    @Test
    public void getSalePrice(){
        assertEquals(917.70, saxaphone.getSalePrice(), 0.001);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals("Brass", saxaphone.getInstrumentFamily());
    }

    @Test
    public void testCanPlay(){
        assertEquals("Zuu zuu duu duuuu ", saxaphone.play());
    }

}