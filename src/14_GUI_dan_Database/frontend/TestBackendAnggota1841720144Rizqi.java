/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720144Rizqi;

/**
 *
 * @author User
 */
public class TestBackendAnggota1841720144Rizqi {
    public static void main(String[] args) {
        Anggota1841720144Rizqi agt1 = new Anggota1841720144Rizqi("Hunayn", "Sidaorjo", "123");
        Anggota1841720144Rizqi agt2 = new Anggota1841720144Rizqi("Ardan", "Bojonegoro", "456");
        Anggota1841720144Rizqi agt3 = new Anggota1841720144Rizqi("Dina", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720144Rizqi k : new Anggota1841720144Rizqi().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1841720144Rizqi a : new Anggota1841720144Rizqi().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
