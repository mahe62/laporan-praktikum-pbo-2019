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
public class Pelanggan1841720144Rizqi {

    private String mNama;
    private Mobil1841720144Rizqi mMobil;
    private Sopir1841720144Rizqi mSopir;
    private int hari;

    public String getNamaRizqi() {
        return mNama;
    }

    public void setNamaRizqi(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720144Rizqi getMobilRizqi() {
        return mMobil;
    }

    public void setMobilRizqi(Mobil1841720144Rizqi mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720144Rizqi getSopirRizqi() {
        return mSopir;
    }

    public void setmSopirRizqi(Sopir1841720144Rizqi mSopir) {
        this.mSopir = mSopir;
    }

    public int getHariRizqi() {
        return hari;
    }

    public void setHariRizqi(int hari) {
        this.hari = hari;
    }

    public int hitungBiayaTotalRizqi() {
        return mMobil.hitungBiayaMobilRizqi(hari) + mSopir.hitungBiayaSopirRizqi(hari);
    }
}
