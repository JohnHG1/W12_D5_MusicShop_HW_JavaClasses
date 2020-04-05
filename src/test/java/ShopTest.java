import instruments.Strings.Guitar;
import instruments.Woodwind.Flute;
import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import trade.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop1;
    private Guitar guitar1;
    private Flute flute1;


    @Before
    public void setUp(){
        shop1 = new Shop("JHG World of Music");
        guitar1 = new Guitar("Yamaha", "Electric Guitar", 250.00, 379.00, "Strings");
        flute1 = new Flute("Reeds Plc", "Steel Flute", 38.50, 51.25, "Woodwind");
    }

    @Test
    public void canGetShopName(){
        assertEquals("JHG World of Music", shop1.getShopName());
    }

    @Test
    public void canGetStockItems(){
        assertEquals(0, shop1.getStockItems().size());
    }

    @Test
    public void canAddStockItemsToStock(){
        shop1.canAddStockItemToStock(guitar1, flute1);
        assertEquals(2, shop1.getStockItems().size());
    }

    @Test
    public void canRemoveProductsFromStock() {
        shop1.canAddStockItemToStock(guitar1, flute1);
        shop1.canRemoveStockItemFromStock(guitar1);
        assertEquals(1, shop1.getStockItems().size());
    }


}
