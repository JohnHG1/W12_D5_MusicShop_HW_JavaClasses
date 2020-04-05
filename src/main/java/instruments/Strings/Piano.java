package instruments.Strings;

import instruments.Instrument;
import interfaces.IPlay;


public class Piano extends Instrument implements IPlay {


    public Piano(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        super(manufacturer, instrumentType, retailPrice, salePrice, instrumentFamily);
    }

    public void calculateMarkup() {

    }

    public String play() {
        return "ping ping ding";
    }
}




