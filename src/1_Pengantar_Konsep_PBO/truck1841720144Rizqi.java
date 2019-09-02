/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truck;

/**
 *
 * @author ASUS
 */
public class truck1841720144Rizqi {
    private String mMerek;
    private int mJumlahTruk;
    private int mRusak;
    
public void merekTruckRizqi (String mrk){
    mMerek = mrk;
}
public void tambahTruckRizqi (int beli){
    mJumlahTruk = mJumlahTruk + beli;
}
public void jualTruckRizqi (int jual){
    mJumlahTruk = mJumlahTruk + jual;
}
public  void kerusakanRizqi (int rsk){
    mRusak = rsk;
}
public void cetakstatusRizqi(){
    System.out.println("Merek Truck : "+ mMerek);
    System.out.println("Jumlah Truck : "+ mJumlahTruk);
    System.out.println("Rusak : "+ mRusak);
}
}
