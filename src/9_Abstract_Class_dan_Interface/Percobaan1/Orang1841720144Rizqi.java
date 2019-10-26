/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class Orang1841720144Rizqi {
    private String mNama;
    private Hewan1841720144Rizqi mHewanPeliharaan;

    public Orang1841720144Rizqi(String mNama) {
        this.mNama = mNama;
    }

    public void peliharaHewanRizqi(Hewan1841720144Rizqi mHewanPeliharaan){
        this.mHewanPeliharaan=mHewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku : "+this.mNama);
        System.out.println("My pet, move with: " );
        this.mHewanPeliharaan.bergerakRizqi();
        System.out.println("================================");
    }
}
