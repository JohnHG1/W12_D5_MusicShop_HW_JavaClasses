package Instruments.Brass;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Saxaphone extends Instrument implements IPlay {

    private int numOfKeys;

    public Saxaphone(String manufacturer, String instrumentType, double retailPrice, double salePrice){
        super(manufacturer, instrumentType, retailPrice, salePrice);
        this.numOfKeys = getNumOfKeys();
    }

    protected int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "Zuu zuu duu duuuu ";
    }
}






