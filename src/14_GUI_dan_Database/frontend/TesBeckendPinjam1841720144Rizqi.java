/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720144Rizqi;
import backend.Buku1841720144Rizqi;
import backend.Peminjaman1841720144Rizqi;

/**
 *
 * @author ASUS
 */
public class TesBeckendPinjam {
    public static void main(String[] args) {
        Anggota1841720144Rizqi Ardan = new Anggota1841720144Rizqi().getById(2);
        Buku1841720144Rizqi kenanglah = new Buku1841720144Rizqi().getById(15);
        Peminjaman1841720144Rizqi peminjaman2 = new Peminjaman1841720144Rizqi(Ardan, kenanglah, "2019/12/21", "2020/01/21");
         
        
         peminjaman2.save();
         
         for (Peminjaman1841720144Rizqi p : new Peminjaman1841720144Rizqi().getAll()) {
            System.out.println("Nama Anggota : " + p.getAnggota().getNama()+ ", Judul Buku : " + p.getBuku().getJudul()+ ", " + "Tanggal Pinjam: " + p.getTanggalpinjam()+ ", Tanggal Kembali: " + p.getTanggalkembali());
        }
    }
   
}
