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
public class Barang1841720144Rizqi {
 public String mNamaBrg,mJenisBrg;
 public int mStok;
 
 public void TampilBarangRizqi(){
     System.out.println("Nama Barang    : "+mNamaBrg);
     System.out.println("Jenis Barang   : "+mJenisBrg);
     System.out.println("Stok           : "+mStok);
 }
 
 public int TambahStokRizqi(int brgMasuk){
     int stockBaru=brgMasuk+mStok;
     return stockBaru;
 }
}
