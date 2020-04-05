package instruments.Brass;

import instruments.Instrument;
import interfaces.IPlay;


public class Saxaphone extends Instrument {


    public Saxaphone(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }


    public void calculateMarkup() {

    }


    public String play() {
        return "Zuu zuu duu duuuu ";
    }
}






