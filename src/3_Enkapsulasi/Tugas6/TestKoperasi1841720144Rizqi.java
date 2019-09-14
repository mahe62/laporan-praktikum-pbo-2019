/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720144Rizqi {

    public static void main(String[] args) {
        Anggota1841720144Rizqi donny = new Anggota1841720144Rizqi("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);

        int pinjm, agsr, pil;

        System.out.println("Nama Anggota: " + donny.GetNamaRizqi());
        System.out.println("Limit Pinjaman: " + donny.GetLimitPinjamanRizqi());
        System.out.println("\nPinjam Tekan 1");
        System.out.println("Angsur Tekan 2\n");

        System.out.print("Pilihan : ");
        pil = sc.nextInt();
        if (pil == 1) {
            System.out.print("\nMasukkan Jumlah Uang yang ingin dipinjam: ");
            donny.PinjamRizqi(pinjm = sc.nextInt());
            System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
            System.out.println("");
        } else if (pil == 2) {
            System.out.print("Masukkan Jumlah Uang yang ingin diangsur: ");
            donny.AngsurRizqi(agsr = sc.nextInt());
            System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
            System.out.println("");
        } else {
            System.out.println("Input Tidak Valid");
        }
    }

}
