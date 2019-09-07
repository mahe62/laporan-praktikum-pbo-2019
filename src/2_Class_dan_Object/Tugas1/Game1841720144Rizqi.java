/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Game1841720144Rizqi {
    public int mId,mHarga;
    public String mNamaMbr,mNamaGme;
    
    public int SewaGameRizqi(int LamaSwa){
        int TotalHarga=mHarga*LamaSwa;
        return TotalHarga;
    }
    public void TampilGameRizqi(){
        System.out.println("ID      : "+mId);
        System.out.println("Nama    : "+mNamaMbr);
        System.out.println("Game    : "+mNamaGme);
        System.out.println("Harga   : "+mHarga);        
    }
}
