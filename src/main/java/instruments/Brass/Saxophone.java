package instruments.Brass;

import instruments.Instrument;
import interfaces.IPlay;



public class Saxophone extends Instrument {


    public Saxophone(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }

    public double markUp() {
        return this.getSalePrice() - this.getRetailPrice();
    }

    public void setRetailPrice(double retailPrice) {

    }

    public void setSalePrice(double salePrice) {

    }


    public String play() {
        return "Zuu zuu duu duuuu ";
    }

}






