package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String manufacturer;
    private String instrumentType;
    private double retailPrice;
    private double salePrice;
    private String instrumentFamily;

    public Instrument(String manufacturer, String instrumentType, double retailPrice, double salePrice, String instrumentFamily){
        this.manufacturer = manufacturer;
        this.instrumentType = instrumentType;
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

    public double calculateMarkup() {
        return 0;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {

    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {

    }

    public String getInstrumentFamily(){
        return instrumentFamily;
    }

//    public abstract void calculateMarkup();
}
