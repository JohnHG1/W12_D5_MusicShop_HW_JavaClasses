package Instruments.Brass;

import Enums.*;
import Instruments.Instrument;
import Interfaces.IPlay;


public class Saxaphone extends Instrument implements IPlay {


    public Saxaphone(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }


    public String play() {
        return "Zuu zuu duu duuuu ";
    }
}






