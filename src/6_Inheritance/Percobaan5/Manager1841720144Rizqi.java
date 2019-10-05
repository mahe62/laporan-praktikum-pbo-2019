/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author ASUS
 */
public class Manager1841720144Rizqi extends Karyawan1841720144Rizqi{
    public int mTunjangan;

    public Manager1841720144Rizqi(){
        
    }

    public Manager1841720144Rizqi(int mTunjangan, String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.mTunjangan = mTunjangan;
    }
    public void tampilDataManager(){
        super.tampilDataKaryawanRizqi();
        System.out.println("Tunjangan       : "+mTunjangan);
        System.out.println("Total Gaji      : "+(super.mGaji+mTunjangan));
    }
}
