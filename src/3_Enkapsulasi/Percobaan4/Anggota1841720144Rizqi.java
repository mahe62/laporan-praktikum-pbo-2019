package koperasigettersetter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Anggota1841720144Rizqi {

    private String mNama, mAlamat;
    private float mSimpanan;

    public Anggota1841720144Rizqi(String nama,String alamat) {
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }

    public void SetNamaRizqi(String nama) {
        this.mNama = nama;
    }

    public void SetAlamatRizqi(String alamat) {
        this.mAlamat = alamat;
    }

    public String GetNamaRizqi() {
        return mNama;
    }

    public String GetAlamatRizqi() {
        return mAlamat;
    }

    public float GetSimpananRizqi() {
        return mSimpanan;
    }
    public void SetorRizqi(float uang){
        mSimpanan +=uang;
    }
    public void PinjamRizqi(float uang){
        mSimpanan -=uang;
    }
    

}
