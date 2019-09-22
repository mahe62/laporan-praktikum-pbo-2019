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
public class Kursi1841720144Rizqi {

    private String mNomer;
    private Penumpang1841720144Rizqi mPenumpang;

    public Kursi1841720144Rizqi(String mNomer) {
        this.mNomer = mNomer;
    }

    public String getmNomerRizqi() {
        return mNomer;
    }

    public void setmNomerRizqi(String mNomer) {
        this.mNomer = mNomer;
    }

    public Penumpang1841720144Rizqi getmPenumpangRizqi() {
        return mPenumpang;
    }

    public void setmPenumpangRizqi(Penumpang1841720144Rizqi mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String infoRizqi() {
        String info = "";
        info += "Nomor: " + mNomer + "\n";
        if (this.mPenumpang != null) {
            info += "Penumpang: " +mPenumpang.infoRizqi()+ "\n";
        }
        return info;
    }
}
