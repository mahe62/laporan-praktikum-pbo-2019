/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkirMobil;

/**
 *
 * @author ASUS
 */
public class Main1841720144Rizqi {
    public static void main(String[] args) {
        Mobil1841720144Rizqi m = new Mobil1841720144Rizqi("Alphard", "AG6000S");
        Pengunjung1841720144Rizqi v = new Pengunjung1841720144Rizqi("Jex", "131232", m);
        System.out.println(v.infoRizqi());
        
        Parkir1841720144Rizqi p = new Parkir1841720144Rizqi("A", 10);
        p.setPengunjungRizqi(v, 1);
        System.out.println(p.infoRizqi());

    }
   
}
