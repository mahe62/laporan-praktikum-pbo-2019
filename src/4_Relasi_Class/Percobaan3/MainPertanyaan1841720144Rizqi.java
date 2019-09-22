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
public class MainPertanyaan1841720144Rizqi {

    public static void main(String[] args) {

        Pegawai1841720144Rizqi masinis = new Pegawai1841720144Rizqi("1234", "Spongebob Squarepants");
        Pegawai1841720144Rizqi asisten = new Pegawai1841720144Rizqi("4567", "Patrick Star");
        KeretaApi21841720144Rizqi keretaApi = new KeretaApi21841720144Rizqi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.infoRizqi());

        Pegawai1841720144Rizqi masisnis1 = new Pegawai1841720144Rizqi("1234", "Spongebob");
        KeretaApi21841720144Rizqi kereta1 = new KeretaApi21841720144Rizqi("Gaya Baru", "Bisnis", masisnis1);
        System.out.println(kereta1.infoRizqi());
    }
}
