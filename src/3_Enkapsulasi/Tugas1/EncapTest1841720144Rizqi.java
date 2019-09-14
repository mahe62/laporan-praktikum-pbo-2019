/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class EncapTest1841720144Rizqi {
    public static void main(String[] args) {
        EncapDemo184120144Rizqi encap = new EncapDemo184120144Rizqi();
        EncapDemo184120144Rizqi encap1 = new EncapDemo184120144Rizqi();
        
        encap.SetNamaeRizqi("James");
        encap.SetAgeRizqi(35);
        
        encap1.SetNamaeRizqi("Rodrigez");
        encap1.SetAgeRizqi(17);
        
        System.out.println("Nama : "+encap.GetNameRizqi());
        System.out.println("Nama : "+encap.GetAgeRizqi());
        System.out.println("");
        
        System.out.println("Nama : "+encap1.GetNameRizqi());
        System.out.println("Nama : "+encap1.GetAgeRizqi());
    }
   
}
