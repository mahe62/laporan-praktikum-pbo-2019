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
public class Staff1841720144Rizqi extends Karyawan1841720144Rizqi{
    public int mLembur,mPotongan;
    public Staff1841720144Rizqi(){
        
    }

    public Staff1841720144Rizqi(int mLembur, int mPotongan, String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.mLembur = mLembur;
        this.mPotongan = mPotongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawanRizqi();
        System.out.println("Lembur          : "+mLembur);
        System.out.println("Potongan        : "+mPotongan);
        System.out.println("Total Gaji      : "+(mGaji+mLembur-mPotongan));
        
    }
}
