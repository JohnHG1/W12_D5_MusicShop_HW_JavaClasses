package Instruments.Woodwind;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Flute extends Instrument implements IPlay {


    public Flute(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }


    public String play() {
        return "pii hii";
    }
}




