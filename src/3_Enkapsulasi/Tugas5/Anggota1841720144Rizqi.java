/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
public class Anggota1841720144Rizqi {

    private int mLimitPeminjaman, mJumlahPinjaman,mLimitAngsran;
    private String mNoKTP,mNama;

    public Anggota1841720144Rizqi(String ktp,String nama,int limit) {
        this.mNoKTP = ktp;
        this.mNama = nama;
        this.mLimitPeminjaman = limit;
        this.mJumlahPinjaman = 0;
        
    }

    public String GetNamaRizqi() {
        return mNama;
    }

    public int GetLimitPinjamanRizqi() {
        return mLimitPeminjaman;
    }

    public void PinjamRizqi(int pjm) {
        if (pjm > mLimitPeminjaman) {
            System.out.println("Mencapai batas \n");
        } else {
           mJumlahPinjaman =mJumlahPinjaman+pjm;
        }
    }
    public void AngsurRizqi(int ags){
        int des = 10 * mJumlahPinjaman/100;
        if (ags<des) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else{
            mJumlahPinjaman=mJumlahPinjaman-ags;
        }
        
    }

    public int GetJumlahPinjamanRizqi() {
        return mJumlahPinjaman;
    }
}
