package Pertanyaan3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Motor1841720144Rizqi {

    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void NyalakanMesinRizqi() {
        mKontakOn = true;
    }

    public void MatikanMesinRizqi() {
        mKontakOn = false;
        mKecepatan = 0;
    }

    public void TambahKecepatanRizqi() {
        if (mKontakOn == true) {
            if (mKecepatan < 100) {
                mKecepatan += 50;
                if (mKecepatan > 100) {
                    mKecepatan = 100;
                    System.out.println("Kecepatan mencapai batas maksimal");

                }
            } else {
                mKecepatan = 100;
                System.out.println("Kecepatan mencapai batas maksimal");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off \n");
        }
    }

    public void KurangiKecepatanRizqi() {
        if (mKontakOn == true) {
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off \n");
        }
    }

    public void PrintStatusRizqi() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan + " \n");
    }

}
