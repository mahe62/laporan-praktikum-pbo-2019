/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author ASUS
 */
public class MainPercobaan41841720144Rizqi {

    public static void main(String[] args) {
        Penumpang1841720144Rizqi p = new Penumpang1841720144Rizqi("12345", "Mr. Krab");
        Gerbong1841720144Rizqi gerbong = new Gerbong1841720144Rizqi("A", 10);
        gerbong.setPenumpangRizqi(p, 1);
        System.out.println(gerbong.infoRizqi());
    }
}
