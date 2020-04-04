package Instruments.Woodwind;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Flute extends Instrument implements IPlay {

    private int numOfHoles;

    public Flute(String manufacturer, String instrumentType, double retailPrice, double salePrice){
        super(manufacturer, instrumentType, retailPrice, salePrice);
        this.numOfHoles = numOfHoles;
    }


    protected int getNumOfStrings() {
        return numOfHoles;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfHoles = numOfHoles;
    }

    public String play() {
        return "pii hii";
    }
}




