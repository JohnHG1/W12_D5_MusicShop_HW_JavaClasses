package instruments.Woodwind;

import instruments.Instrument;
import interfaces.IPlay;


public class Flute extends Instrument implements IPlay {


    public Flute(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
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
        return "pii hii";
    }
}




