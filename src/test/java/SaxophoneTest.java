import instruments.Brass.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Sony", "Alto Saxaphone",  655.50, 917.70, "Brass");
    }

    @Test
    public void getManufacturer() {
        assertEquals("Sony", saxophone.getManufacturer());
    }

    @Test
    public void getInstrumentType(){
        assertEquals("Alto Saxaphone", saxophone.getInstrumentType());
    }

    @Test
    public void getRetailPrice(){
        assertEquals(655.50, saxophone.getRetailPrice(), 0.001);
    }

    @Test
    public void getSalePrice(){
        assertEquals(917.70, saxophone.getSalePrice(), 0.001);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals("Brass", saxophone.getInstrumentFamily());
    }

    @Test
    public void testCanPlay(){
        assertEquals("Zuu zuu duu duuuu ", saxophone.play());
    }

}