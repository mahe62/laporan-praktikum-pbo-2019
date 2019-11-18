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
import java.util.ArrayList;

public class InputData1841720144Rizqi {

    ArrayList<Mahasiswa1841720144Rizqi> ListMahasiswa;

    public InputData1841720144Rizqi() {
        ListMahasiswa = new ArrayList();
    }
   public void isiDataRizqi(String mNim, String mNama, String mAlamat){
        Mahasiswa1841720144Rizqi mhs = new Mahasiswa1841720144Rizqi(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }
   
   public ArrayList<Mahasiswa1841720144Rizqi> getData(){
       return ListMahasiswa;
   }
}
