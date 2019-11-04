/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class ElectricityBill1841720144Rizqi implements Payable1841720144Rizqi{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720144Rizqi(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwh() {
        return mKwh;
    }

    public void setmKwh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmount() {
        return mKwh+getBasePrice();
    }
    public int getBasePrice(){
        int bPrice = 0;
        switch(mCategory){
        case "R-1" : bPrice = 100;
        break;
        case "R-2" : bPrice = 200;
        break;
        }
        return bPrice;
    }
    
    public String getBillInfo(){
        return "KWH = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePrice()+"per KWH)\n";
    }
    
}
