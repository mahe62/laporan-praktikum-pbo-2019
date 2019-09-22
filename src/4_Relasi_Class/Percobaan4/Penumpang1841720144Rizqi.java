/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author ASUS
 */
public class Penumpang1841720144Rizqi {

    private String mNama, mKTP;

    public Penumpang1841720144Rizqi(String mNama, String mKTP) {
        this.mNama = mNama;
        this.mKTP = mKTP;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKTP() {
        return mKTP;
    }

    public void setmKTP(String mKTP) {
        this.mKTP = mKTP;
    }

    public String infoRizqi() {
        String info = "";
        info += "Ktp: " + mKTP + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
