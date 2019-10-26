/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan2;

import interfacelatihan.*;

/**
 *
 * @author ASUS
 */
public class Sarjana1841720144Rizqi extends Mahasiswa1841720144Rizqi implements ICumlaude1841720144Rizqi,IBerprestasi1841720144Rizqi{

    public Sarjana1841720144Rizqi(String mNama) {
        super(mNama);
    }

    @Override
    public void LulusRizqi() {
        System.out.println("Aku menyelesaikan SKRIPSI");
    }
    @Override
    public void MeraihIPKTinggiRizqi(){
        System.out.println("IPK-ku Lebih dari 3,51");
    }

    @Override
    public void KuliahDiKampusRizqi() {
        super.KuliahDiKampusRizqi();
    }
    
        @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
