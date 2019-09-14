package Percobaan1;

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

    public int mKecepatan = 0;
    public boolean mKontakOn = false;
    
    public void PrintStatusRizqi() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan + " \n");
    }

}
