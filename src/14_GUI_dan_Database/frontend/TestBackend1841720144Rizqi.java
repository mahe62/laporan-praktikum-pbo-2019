/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mwpras
 */
import backend.*;

public class TestBackend1841720144Rizqi {
    public static void main(String[] args){
        Kategori1841720144Rizqi kat1 = new Kategori1841720144Rizqi("Novel", "Koleksi buku novel");
        Kategori1841720144Rizqi kat2 = new Kategori1841720144Rizqi("Referensi", "Buku referensi ilmiah");
        Kategori1841720144Rizqi kat3 = new Kategori1841720144Rizqi("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1841720144Rizqi k : new Kategori1841720144Rizqi().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1841720144Rizqi k : new Kategori1841720144Rizqi().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
