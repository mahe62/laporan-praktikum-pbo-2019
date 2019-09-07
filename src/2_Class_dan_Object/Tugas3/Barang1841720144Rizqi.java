/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author ASUS
 */
public class Barang1841720144Rizqi {
 public String mKode,mNamaBarang;
 public int mHargaDasar;
 public float mDiskon;
 
 
 public float HitungHargaJualRizqi(){
     float hargaJual=mHargaDasar-(mDiskon*mHargaDasar);
     return hargaJual;
     
 }
 public void TampilDataRizqi(){
     System.out.println("Kode         :"+mKode);
     System.out.println("Nama Barang  :"+mNamaBarang);
     System.out.println("Harga Dasar  :"+mHargaDasar);
     System.out.println("Diskon       :"+mDiskon);
     System.out.println("Harga Jual       :"+HitungHargaJualRizqi());
 }
}
