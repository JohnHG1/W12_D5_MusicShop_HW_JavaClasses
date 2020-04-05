import instruments.Strings.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steiner", "Baby Grand",  3565.19, 4991.26, "Strings");
    }

    @Test
    public void getManufacturer() {
        assertEquals("Steiner", piano.getManufacturer());
    }

    @Test
    public void getInstrumentType(){
        assertEquals("Baby Grand", piano.getInstrumentType());
    }

    @Test
    public void getRetailPrice(){
        assertEquals(3565.19, piano.getRetailPrice(), 0.001);
    }

    @Test
    public void getSalePrice(){
        assertEquals(4991.26, piano.getSalePrice(), 0.001);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals("Strings", piano.getInstrumentFamily());
    }

    @Test
    public void testCanPlay(){
        assertEquals("ping ping ding", piano.play());
    }

}