package Instruments.Strings;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Piano extends Instrument implements IPlay {

    private int numOfKeys;

    public Piano(String manufacturer, String instrumentType, double retailPrice, double salePrice){
        super(manufacturer, instrumentType, retailPrice, salePrice);
        this.numOfKeys = numOfKeys;
    }


    protected int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "ping ping ding";
    }
}




