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

public class TestBackendBuku1841720144Rizqi {
    public static void main(String[] args){
        Kategori1841720144Rizqi novel = new Kategori1841720144Rizqi().getById(4);
        Kategori1841720144Rizqi referensi = new Kategori1841720144Rizqi().getById(8);
        
        Buku1841720144Rizqi buku1 = new Buku1841720144Rizqi(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720144Rizqi buku2 = new Buku1841720144Rizqi(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720144Rizqi buku3 = new Buku1841720144Rizqi(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1841720144Rizqi b : new Buku1841720144Rizqi().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1841720144Rizqi b : new Buku1841720144Rizqi().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
