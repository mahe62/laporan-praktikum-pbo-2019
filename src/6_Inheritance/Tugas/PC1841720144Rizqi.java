/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class PC1841720144Rizqi extends Komputer1841720144Rizqi{
    public int mUkuranMonitor;

    public PC1841720144Rizqi() {
    }

    public PC1841720144Rizqi(int mUkuranMonitor, String mMerek, String mJnisProsessor, int mKecProsessor, int mSizeMemory) {
        super(mMerek, mJnisProsessor, mKecProsessor, mSizeMemory);
        this.mUkuranMonitor = mUkuranMonitor;
    }
    
    public void tampilPCRizqi(){
        super.tampilDataRizqi();
        System.out.println("Ukuran Monitor      : "+mUkuranMonitor);
    }
}
