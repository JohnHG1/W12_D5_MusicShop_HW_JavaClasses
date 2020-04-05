package Instruments;

import Interfaces.IPlay;
import Enums.*;

public abstract class Instrument implements IPlay {

    private String manufacturer;
    private String instrumentType;
    private double retailPrice;
    private double salePrice;
    private String instrumentFamily;

    public Instrument(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        this.manufacturer = manufacturer;
        this. instrumentType = instrumentType;
        this.retailPrice = retailPrice;
        this.salePrice = salePrice;
        this.instrumentFamily = instrumentFamily;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public String getInstrumentFamily(){
        return instrumentFamily;
    }


}
