/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class PascaSarjana1841720144Rizqi extends Mahasiswa1841720144Rizqi implements  ICumlaude1841720144Rizqi{

    public PascaSarjana1841720144Rizqi(String mNama) {
        super(mNama);
    }
    @Override
    public void LulusRizqi(){
        System.out.println("Aku Sudah Menyelesaikan TESIS");
    }
    
    @Override
    public void MeraihIPKTinggiRizqi(){
        System.out.println("IPK-ku LEbih dari 3,71");
    }

    @Override
    public void KuliahDiKampusRizqi() {
        super.KuliahDiKampusRizqi();
    }
 
    
    
    
}
