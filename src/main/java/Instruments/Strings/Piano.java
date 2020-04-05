package Instruments.Strings;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Piano extends Instrument implements IPlay {


    public Piano(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }


    public String play() {
        return "ping ping ding";
    }
}




