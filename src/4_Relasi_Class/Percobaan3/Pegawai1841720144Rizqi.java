/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author ASUS
 */
public class Pegawai1841720144Rizqi {

    private String mNip;
    private String mNama;

    public Pegawai1841720144Rizqi(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNipRizqi() {
        return mNip;
    }

    public void setmNipRizqi(String mNip) {
        this.mNip = mNip;
    }

    public String getmNamaRizqi() {
        return mNama;
    }

    public void setmNamaRizqi(String mNama) {
        this.mNama = mNama;
    }

    public String info() {
        String info = "";
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }
}
