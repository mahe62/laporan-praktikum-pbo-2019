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
public class Mobil1841720144Rizqi {
    private String mMerek,mPlat;

    public Mobil1841720144Rizqi(String mMerek, String mPlat) {
        this.mMerek = mMerek;
        this.mPlat = mPlat;
    }

    public Mobil1841720144Rizqi() {
    }
    

    public String getmMerek() {
        return mMerek;
    }

    public void setmMerek(String mMerek) {
        this.mMerek = mMerek;
    }

    public String getmPlat() {
        return mPlat;
    }

    public void setmPlat(String mPlat) {
        this.mPlat = mPlat;
    }
     public String infoRizqi(){
        String info = "";
        info += "Merek: " + this.mMerek + "\n";
        info += "Plat: " + this.mPlat + "\n";
        return info;
     }
}
