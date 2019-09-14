/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author ASUS
 */
public class KoperasiDemo1841720144Rizqi {

    public static void main(String[] args) {
        Anggota1841720144Rizqi a1 = new Anggota1841720144Rizqi("iwan", "jalan mawar");
        System.out.println("Simpanan " + a1.GetNamaRizqi() + " : Rp. " + a1.GetSimpananRizqi());

        a1.SetNamaRizqi("iwan Setiawan");
        a1.SetAlamatRizqi("Jalan Sukarno Hatta no 10");
        a1.SetorRizqi(100000);
        System.out.println("Simpanan " + a1.GetNamaRizqi() + " : Rp. " + a1.GetSimpananRizqi());
        a1.PinjamRizqi(5000);
        System.out.println("Simpanan " + a1.GetNamaRizqi() + " : Rp. " + a1.GetSimpananRizqi());
    }
}
