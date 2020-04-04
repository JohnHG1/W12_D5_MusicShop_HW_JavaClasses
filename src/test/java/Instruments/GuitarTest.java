package Instruments;

import Enums.*;
import Instruments.Strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Yamaha", "Bass Guitar", 325.00, 587.25);
    }

    @Test
    public void getManufacturer(){
        assertEquals("Yamaha", guitar.getManufacturer());
        }


}
