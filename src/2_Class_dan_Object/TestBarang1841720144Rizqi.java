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
public class TestBarang1841720144Rizqi {
    public static void main(String[] args) {
     Barang1841720144Rizqi b1=new Barang1841720144Rizqi();
    b1.mNamaBrg="Penisl";
    b1.mJenisBrg="ATK";
    b1.mStok=10;
    b1.TampilBarangRizqi();
    
        System.out.println("Stok Baru adalah "+b1.TambahStokRizqi(20));
    }   
}
