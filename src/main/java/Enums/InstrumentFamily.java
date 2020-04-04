package Enums;

public enum InstrumentFamily {
    STRING ("Strings"),
    WOODWIND ("Woodwind"),
    BRASS ("Brass");

    private String instrumentFamily;

    InstrumentFamily(String instrumentFamily){
        this.instrumentFamily = instrumentFamily;
    }

    public String getInstrumentFamily(){
        return instrumentFamily;
    }

    public void setInstrumentFamily(String family){
        this.instrumentFamily = instrumentFamily;
    }


}
