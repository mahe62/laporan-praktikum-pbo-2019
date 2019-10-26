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
public class Rektor1841720144Rizqi{
    
public void BeriSertifikatCumlaude(ICumlaude1841720144Rizqi mahasiswa){
    System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
    System.out.println("Selamat! Silahkan perkenalkan diri Anda..");
    
    mahasiswa.KuliahDiKampusRizqi();
    mahasiswa.LulusRizqi();
    mahasiswa.MeraihIPKTinggiRizqi();
    
    System.out.println("==========================================");
}

public void beriSertifikatMawapres(IBerprestasi1841720144Rizqi mahasiswa){
    System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
    System.out.println("Selamat! Bagaimana Anda bisa Berprestasi?");
    
    mahasiswa.menjuaraiKompetisi();
    mahasiswa.membuatPublikasiIlmiah();
    System.out.println("==========================================");
}
}
