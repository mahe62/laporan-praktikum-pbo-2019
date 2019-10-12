package Percobaan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Karyawan1841720144Rizqi {
    private String mNama,mNip,mGolongan;
    private double mGaji;

    public void setmNamaRizqi(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipRizqi(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganRizqi(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch(mGolongan.charAt(0)){
        case '1':this.mGaji=5000000;
        break;
        case '2':this.mGaji=3000000;
        break;
        case '3':this.mGaji=2000000;
        break;
        case '4':this.mGaji=1000000;
        break;
        case '5':this.mGaji=750000;
        break;
        }
    }

    public void setmGajiRizqi(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaRizqi() {
        return mNama;
    }

    public String getmNipRizqi() {
        return mNip;
    }

    public String getmGolonganRizqi() {
        return mGolongan;
    }

    public double getmGajiRizqi() {
        return mGaji;
    }
    
    
    
    
    
}
