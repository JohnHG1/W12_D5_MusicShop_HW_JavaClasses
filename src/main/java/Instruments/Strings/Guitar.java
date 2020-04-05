package Instruments.Strings;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Guitar extends Instrument implements IPlay {


    public Guitar(String manufacturer, String instrumentType, double retailPrice, double salePrice, String family){
        super(manufacturer, instrumentType, retailPrice, salePrice, family);
    }




    public String play() {
        return "Da la ga ha";
    }
}
