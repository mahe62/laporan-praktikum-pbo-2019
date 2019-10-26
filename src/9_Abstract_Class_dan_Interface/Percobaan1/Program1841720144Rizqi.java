/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class Program1841720144Rizqi {
    public static void main(String[] args) {
        Kucing1841720144Rizqi KucingKampung = new Kucing1841720144Rizqi();
        Ikan1841720144Rizqi LumbaLumba =  new Ikan1841720144Rizqi();
        
        Orang1841720144Rizqi ani = new Orang1841720144Rizqi("Ani");
        Orang1841720144Rizqi budi = new Orang1841720144Rizqi("Budi");
        
        budi.peliharaHewanRizqi(LumbaLumba);
        ani.peliharaHewanRizqi(KucingKampung);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
