package Instruments;

import Enums.*;
import Instruments.Strings.Piano;
import Instruments.Woodwind.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steiner", "Baby Grand",  3565.19, 5550.00, "Strings");
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
        assertEquals(5550.00, piano.getSalePrice(), 0.001);
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