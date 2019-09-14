/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;
/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720144Rizqi {

    public static void main(String[] args) {
        Anggota1841720144Rizqi donny = new Anggota1841720144Rizqi("111333444", "Donny", 5000000);
        
        
        System.out.println("Nama Anggota: " + donny.GetNamaRizqi());
        System.out.println("Limit Pinjaman: " + donny.GetLimitPinjamanRizqi());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.PinjamRizqi(10000000);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.PinjamRizqi(5000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.AngsurRizqi(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.AngsurRizqi(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());
        donny.AngsurRizqi(1000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.GetJumlahPinjamanRizqi());

    }

}
