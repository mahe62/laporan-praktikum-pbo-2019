/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author ASUS
 */
public class MainPercobaan21841720144Rizqi {

    public static void main(String[] args) {
        Mobil1841720144Rizqi m = new Mobil1841720144Rizqi();
        m.setmMerkRizqi("Avanza");
        m.setmBiayaRizqi(350000);
        Sopir1841720144Rizqi s = new Sopir1841720144Rizqi();
        s.setmNamaRizqi("John Doe");
        s.setMbiayaRizqi(200000);
        Pelanggan1841720144Rizqi p = new Pelanggan1841720144Rizqi();
        p.setNamaRizqi("Jane Doe");
        p.setMobilRizqi(m);
        p.setmSopirRizqi(s);
        p.setHariRizqi(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalRizqi());
    }

}
