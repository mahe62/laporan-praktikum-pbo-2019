/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class Mobil1841720144Rizqi {

    private String mMerk;
    private int mBiaya;

    public Mobil1841720144Rizqi() {
    }

    public int hitungBiayaMobilRizqi(int hari) {
        return mBiaya * hari;
    }

    public String getmMerkRizqi() {
        return mMerk;
    }

    public void setmMerkRizqi(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiayaRizqi() {
        return mBiaya;
    }

    public void setmBiayaRizqi(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
}
