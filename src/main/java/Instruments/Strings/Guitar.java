package Instruments.Strings;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Guitar extends Instrument implements IPlay {

    private int numOfStrings;

    public Guitar(String manufacturer, String instrumentType, double retailPrice, double salePrice){
        super(manufacturer, instrumentType, retailPrice, salePrice);
        this.numOfStrings = numOfStrings;
    }



    protected int getNumOfStrings() {
        return numOfStrings;
    }


    public String play() {
        return "Da la ga ha";
    }
}
