package instruments.Strings;

import instruments.Instrument;
import interfaces.IPlay;


public class Guitar extends Instrument implements IPlay {


    public Guitar(String manufacturer, String instrumentType, double retailPrice, double salePrice, String family){
        super(manufacturer, instrumentType, retailPrice, salePrice, family);
    }



    public double markUp() {
        return this.getSalePrice() - this.getRetailPrice();
    }

    public void setRetailPrice(double retailPrice) {

    }

    public void setSalePrice(double salePrice) {

    }

    public String play() {
        return "Da la ga ha";
    }
}
