package trade;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<ISell> stockItems;
    private String stockItem;

    public Shop(String shopName){
        this.shopName = shopName;
        this.stockItems = new ArrayList<ISell>();
    }

    public String getShopName(){
        return this.shopName;
    }

    public ArrayList<ISell> getStockItems(){
        return this.stockItems;
    }

    public void canAddStockItemToStock(ISell stockItem){
        for(ISell item : stockItems){
            this.stockItems.add(stockItem);
        }
    }

//    public void canRemoveStockItemFromStock(ISell stockItems){
//        for(ISell item : item){
//            this.stockItems.remove(stockItems);
//        }
//    }

//    public double calculateProfitFromSale(){
//        double profitFromSale = 0;
//        for(ISell item : stockItems){
//            profitFromSale = (stockItems.getSalePrice - stockItems.getRetailPrice());
//        }
//        return profitFromSale;
//    }




}
