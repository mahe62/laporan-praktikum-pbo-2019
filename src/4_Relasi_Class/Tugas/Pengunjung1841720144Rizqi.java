/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkirMobil;

/**
 *
 * @author ASUS
 */
public class Pengunjung1841720144Rizqi {
    private String mNama,mKtp;
    private Mobil1841720144Rizqi mMobil;

    public Pengunjung1841720144Rizqi() {
    }

    public Pengunjung1841720144Rizqi(String mNama, String mKtp, Mobil1841720144Rizqi mMobil) {
        this.mNama = mNama;
        this.mKtp = mKtp;
        this.mMobil = mMobil;
    }
    
    

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKtp() {
        return mKtp;
    }

    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }

    public Mobil1841720144Rizqi getmMobil() {
        return mMobil;
    }

    public void setmMobil(Mobil1841720144Rizqi mMobil) {
        this.mMobil = mMobil;
    }
    public String infoRizqi(){
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "KTP: " + this.mKtp + "\n";
        info += "Mobil " + this.mMobil.infoRizqi() + "\n";  
        return info;
     }
    
}
