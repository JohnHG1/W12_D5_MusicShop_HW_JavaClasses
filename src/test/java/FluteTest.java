import instruments.Woodwind.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp() {
        flute = new Flute("Jackobs", "Reed Flute", 45.30, 63.42, "Woodwind");
    }

    @Test
    public void getManufacturer() {
        assertEquals("Jackobs", flute.getManufacturer());
    }

    @Test
    public void getInstrumentType(){
        assertEquals("Reed Flute", flute.getInstrumentType());
    }

    @Test
    public void getRetailPrice(){
        assertEquals(45.30, flute.getRetailPrice(), 0.001);
    }

    @Test
    public void getSalePrice(){
        assertEquals(63.42, flute.getSalePrice(), 0.001);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals("Woodwind", flute.getInstrumentFamily());
    }

    @Test
    public void testCanPlay(){
        assertEquals("pii hii", flute.play());
    }

//    @Test
//    public void getMarkUp(){
//        assertEquals(12.75, flute.markUp());
//    }



}