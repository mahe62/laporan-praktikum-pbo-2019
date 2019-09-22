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
public class gerbong21841720144Rizqi {

    private String mKode;
    private Kursi1841720144Rizqi[] mArrayKursi;

    public gerbong21841720144Rizqi(String mKode, int jumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720144Rizqi[jumlah];
        this.initKursiRizqi();
    }

    private void initKursiRizqi() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720144Rizqi(String.valueOf(i + 1));
        }
    }

    public String infoRizqi() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720144Rizqi kursi : mArrayKursi) {
            info += kursi.infoRizqi();
        }
        return info;
    }

    public String getmKodeRizqi() {
        return mKode;
    }

    public void setmKodeRizqi(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720144Rizqi[] getmArrKursiRizqi() {
        return mArrayKursi;
    }

    public void setmArrKursiRizqi(Kursi1841720144Rizqi[] mArrKursi) {
        this.mArrayKursi = mArrayKursi;
    }

    public void setPenumpangRizqi(Penumpang1841720144Rizqi penumpang, int nomor) {
        if (this.mArrayKursi[nomor - 1].getmPenumpangRizqi() == null) {
            this.mArrayKursi[nomor - 1].setmPenumpangRizqi(penumpang);
        } else {
            System.out.println("Kursi Nomor: "+nomor+" Sudah Ditempati");
            
        }

    }

}
