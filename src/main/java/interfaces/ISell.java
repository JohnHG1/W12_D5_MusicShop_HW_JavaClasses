package interfaces;

public interface ISell {

    double calculateMarkup();

    double getRetailPrice();

    void setRetailPrice(double retailPrice);

    double getSalePrice();

    void setSalePrice(double salePrice);
}