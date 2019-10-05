/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

import Percobaan5.*;

/**
 *
 * @author ASUS
 */
public class Karyawan1841720144Rizqi {
    public String mNama,mAlamat,mJk;
    public int mUmur,mGaji;

    public Karyawan1841720144Rizqi() {
    }
    

    public Karyawan1841720144Rizqi(String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mJk = mJk;
        this.mUmur = mUmur;
        this.mGaji = mGaji;
    }
    public void tampilDataKaryawanRizqi(){
        System.out.println("Nama            : "+mNama);
        System.out.println("Alamat          : "+mAlamat);
        System.out.println("Jenis Kelamin   : "+mJk);
        System.out.println("Umur            : "+mUmur);
        System.out.println("Gaji            : "+mGaji);
    }
    
}
