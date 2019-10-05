/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Mac1841720144Rizqi extends Laptop1841720144Rizqi{
    public String mScurity;

    public Mac1841720144Rizqi() {
    }

    public Mac1841720144Rizqi(String mScurity, String mJnsBatrai, String mMerek, String mJnisProsessor, int mKecProsessor, int mSizeMemory) {
        super(mJnsBatrai, mMerek, mJnisProsessor, mKecProsessor, mSizeMemory);
        this.mScurity = mScurity;
    }
    public void tampilMacRizqi(){
        super.tampilLaptopRizqi();
        System.out.println("Security        : "+mScurity);
    }
    
}
