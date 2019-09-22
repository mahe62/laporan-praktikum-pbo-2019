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
public class KeretaApi1841720144Rizqi {

    private String mNama;
    private String mKelas;
    private Pegawai1841720144Rizqi mMasinis;
    private Pegawai1841720144Rizqi mAsisten;

    public KeretaApi1841720144Rizqi(String mNama, String mKelas, Pegawai1841720144Rizqi mMasinis, Pegawai1841720144Rizqi mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public KeretaApi1841720144Rizqi(String mNama, String mKelas, Pegawai1841720144Rizqi mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720144Rizqi() {
    }

    public String getmNamaRizqi() {
        return mNama;
    }

    public void setmNamaRizqi(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelasRizqi() {
        return mKelas;
    }

    public void setmKelasRizqi(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720144Rizqi getmMasinisRizqi() {
        return mMasinis;
    }

    public void setmMasinisRizqi(Pegawai1841720144Rizqi mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720144Rizqi getmAsistenRizqi() {
        return mAsisten;
    }

    public void setmAsistenRizqi(Pegawai1841720144Rizqi mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String infoRizqi() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.info() + "\n";
        info += "Asisten: " + this.mAsisten.info() + "\n";
        return info;

    }
}

