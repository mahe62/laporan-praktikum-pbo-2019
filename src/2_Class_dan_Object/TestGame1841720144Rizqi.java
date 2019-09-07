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
public class TestGame1841720144Rizqi {
    public static void main(String[] args) {
        Game1841720144Rizqi g1=new Game1841720144Rizqi();
        
        g1.mId=1;
        g1.mNamaMbr="Jack Sparrow";
        g1.mNamaGme="HAGO";
        g1.mHarga=20000;
        g1.TampilGameRizqi();
        System.out.println("Total harga : "+g1.SewaGameRizqi(3));
        
    }
}
