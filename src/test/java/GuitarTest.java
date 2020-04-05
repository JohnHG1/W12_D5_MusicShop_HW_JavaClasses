import instruments.Strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Yamaha", "Bass Guitar", 325.00, 455.00, "Strings");
    }

    @Test
    public void getManufacturer() {
        assertEquals("Yamaha", guitar.getManufacturer());
    }

    @Test
    public void getInstrumentType(){
        assertEquals("Bass Guitar", guitar.getInstrumentType());
    }

    @Test
    public void getRetailPrice(){
        assertEquals(325.00, guitar.getRetailPrice(), 0.001);
    }

    @Test
    public void getSalePrice(){
        assertEquals(455.00, guitar.getSalePrice(), 0.001);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals("Strings", guitar.getInstrumentFamily());
    }

   @Test
    public void testCanPlay(){
        assertEquals("Da la ga ha", guitar.play());
   }

}