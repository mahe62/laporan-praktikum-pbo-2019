/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class MainPercobaan11841720144Rizqi {

    public static void main(String[] args) {
        Processor1841720144Rizqi p = new Processor1841720144Rizqi("Intel i5", 3);
        Laptop1841720144Rizqi l = new Laptop1841720144Rizqi("Thinkpad", p);

        l.infoRizqi();

        Processor1841720144Rizqi p1 = new Processor1841720144Rizqi();
        p1.setmMerkRizqi("Intel i5");
        p1.SetCacheRizqi(4);
        Laptop1841720144Rizqi l1 = new Laptop1841720144Rizqi();
        l1.setmMerkRizqi("Thinkpad");
        l1.setmProcRizqi(p1);
        l1.infoRizqi();
    }

}
